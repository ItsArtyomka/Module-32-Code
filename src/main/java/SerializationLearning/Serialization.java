package SerializationLearning;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@SuppressWarnings("DuplicateExpressions")
public class Serialization {
    public static void main(String[] args) throws Exception {
        // SerializationLearning.Serialization of Object
        StudentData studentData = new StudentData();
        studentData.setFirstName("David");
        studentData.setLastName("Goggins");
        studentData.setGrade(11);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("/Users/Artyom/Desktop/Goggins.data")))) {
            outputStream.writeObject(studentData);
            outputStream.flush();
        }

        // Deserialization of Object
        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get("/Users/Artyom/Desktop/Goggins.data")));
        StudentData object = (StudentData) objectInputStream.readObject();
        System.out.println(object.getFirstName());
        System.out.println(object.getLastName());
        System.out.println(object.getGrade());
    }
}

