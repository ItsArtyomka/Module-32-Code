package SerializationLearning;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

@SuppressWarnings("DuplicateExpressions")
public class JSON_Serialization {
    public static void main(String[] args) throws Exception{
        StudentData studentData = new StudentData();
        studentData.setFirstName("Luke");
        studentData.setLastName("Belmar");
        studentData.setGrade(12);

        // SerializationLearning.Serialization
        ObjectMapper objectMapper = new ObjectMapper();
        Files.write(Paths.get("/Users/Artyom/Desktop/Luke.json"), Collections.singleton(objectMapper.writeValueAsString(studentData)));

        // Deserialization
        String rawJson = Files.readString(Paths.get("/Users/Artyom/Desktop/Luke.json"));
        StudentData deserialized = objectMapper.readValue(rawJson, StudentData.class);
        System.out.println(deserialized);
    }
}
