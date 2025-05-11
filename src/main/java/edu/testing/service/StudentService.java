package edu.testing.service;

import edu.testing.dto.Student;
import edu.testing.entity.StudentEntity;

public interface StudentService {
    StudentEntity createStudent(Student student);
}
