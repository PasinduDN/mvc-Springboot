package edu.testing.controller;

import edu.testing.dto.Course;
import edu.testing.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/getListOfCourseList")
    public List<Course> getListOfCourse(){
        CourseService courseService = new CourseService();
        List<Course> courses = courseService.getListOfCourse();
        return  courses;
    }
}
