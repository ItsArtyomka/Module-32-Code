package com.artyomka.springmvc.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@Data
public class StudentData implements Serializable {
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("grade")
    private int grade;
}
