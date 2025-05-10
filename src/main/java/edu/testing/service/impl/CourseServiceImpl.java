package edu.testing.service.impl;

import edu.testing.dto.Course;
import edu.testing.service.CourseService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    public List<Course> getListOfCourse(){
        ArrayList<Course> coursesList = new ArrayList();
        coursesList.add(new Course("D001","001", "50000","15"));
        coursesList.add(new Course("D002","002", "60000","16"));
        coursesList.add(new Course("D003","003", "70000","17"));
        coursesList.add(new Course("D004","004", "80000","18"));
        coursesList.add(new Course("D005","005", "90000","19"));
        return coursesList;
    }
}
