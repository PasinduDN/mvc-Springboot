package edu.testing.controller;
import edu.testing.dto.Student;
import edu.testing.entity.StudentEntity;
import edu.testing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    StudentEntity createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
