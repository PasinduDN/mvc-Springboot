package edu.testing.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String contactNumber;

}
