package Question32_2_4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Question32_2_4 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        TrainData train = new TrainData();
        train.setSerialNumber(1234200L);
        train.setDestinationCity("Moscow");
        train.setMaxSpeed(50);
        train.setTime(200);
        train.setCapacity(300);
        System.out.println(objectMapper.writeValueAsString(train));
    }
}
