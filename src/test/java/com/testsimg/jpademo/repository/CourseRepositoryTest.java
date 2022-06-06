package com.testsimg.jpademo.repository;

import com.testsimg.jpademo.model.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author girishkumarkadambari
 */
@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private  CourseRepository courseRepository;
    
    @Test
    public void prinCourses(){
        List<Course > courseList = courseRepository.findAll();

        System.out.println("courseList = " + courseList);
    }
    
}