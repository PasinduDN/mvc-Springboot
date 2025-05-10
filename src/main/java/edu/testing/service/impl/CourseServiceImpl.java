package edu.testing.service.impl;

import edu.testing.dto.Course;
import edu.testing.service.CourseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Value("${application.institute}")
    String institute;

    public List<Course> getListOfCourse(){
        ArrayList<Course> coursesList = new ArrayList();
        coursesList.add(new Course("D001",institute, "50000","15"));
        coursesList.add(new Course("D002",institute, "60000","16"));
        coursesList.add(new Course("D003",institute, "70000","17"));
        coursesList.add(new Course("D004",institute, "80000","18"));
        coursesList.add(new Course("D005",institute, "90000","19"));
        return coursesList;
    }
}
