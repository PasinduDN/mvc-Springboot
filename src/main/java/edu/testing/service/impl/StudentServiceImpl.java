package edu.testing.service.impl;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.testing.dto.Student;
import edu.testing.entity.StudentEntity;
import edu.testing.repository.StudentRepostory;
import edu.testing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepostory studentRepostory;

    @Autowired
    ObjectMapper mapper;

    public StudentEntity createStudent(Student student){

        //Model to Entity Conversion - Manual
//        StudentEntity studentEntity = new StudentEntity();
//        studentEntity.setFirstName(student.getFirstName());
//        studentEntity.setLastName(student.getLastName());
//        studentEntity.setContactNumber(student.getContactNumber());

        //Model to Entity Conversion - Auto
        StudentEntity entity = mapper.convertValue(student, StudentEntity.class);

        //Saving Data - Manual
//        return studentRepostory.save(studentEntity);

        //Saving Data - Auto
        return studentRepostory.save(entity);
    }

}
