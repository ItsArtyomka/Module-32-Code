package Question32_2_3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Question32_2_3 {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Deserialization
        String rawJson = Files.readString(Paths.get("/Users/Artyom/Desktop/Question.json"));
        QuestionData deserialized = objectMapper.readValue(rawJson, QuestionData.class);
        System.out.println(objectMapper.writeValueAsString(deserialized));
    }
}
