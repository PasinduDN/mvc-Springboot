package edu.testing.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Course {
    private String description;
    private String code;
    private String fee;
    private String duration;
}
