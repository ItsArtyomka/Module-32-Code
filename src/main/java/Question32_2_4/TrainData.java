package Question32_2_4;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrainData {
    @JsonProperty("serialNumber")
    private Long serialNumber;
    @JsonProperty("capacity")
    private int capacity;
    @JsonProperty("destinationCity")
    private String destinationCity;
    @JsonProperty("time")
    private int time;
    @JsonProperty("maxSpeed")
    private int maxSpeed;

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
