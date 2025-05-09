package edu.testing.controller;

import edu.testing.dto.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/getCourseList")
    public List<Course> getCourse(){
        ArrayList<Course> courseList = new ArrayList();
        courseList.add(new Course("C001","01", "5000","5"));
        courseList.add(new Course("C002","02", "6000","6"));
        courseList.add(new Course("C003","03", "7000","7"));
        courseList.add(new Course("C004","04", "8000","8"));
        courseList.add(new Course("C005","05", "9000","9"));
        return courseList;
    }
}
