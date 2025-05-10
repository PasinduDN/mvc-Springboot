package edu.testing.controller;

import edu.testing.dto.Course;
import edu.testing.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/getListOfCourseList")
    public List<Course> getListOfCourse(){

        return courseService.getListOfCourse();
    }
}
