package com.testsimg.jpademo.repository;

import com.testsimg.jpademo.model.Course;
import com.testsimg.jpademo.model.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author girishkumarkadambari
 */

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder().credit(5).title("Python").build();

        CourseMaterial courseMaterial= CourseMaterial.builder()
                .url("www.girish.com")
                .course(course).build();

        courseMaterialRepository.save(courseMaterial);
    }


    @Test
    public  void printAllCourses(){
        List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();
        System.out.println("courseMaterials = " + courseMaterials);
    }
}