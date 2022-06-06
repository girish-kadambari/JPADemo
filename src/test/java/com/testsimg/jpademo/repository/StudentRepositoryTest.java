package com.testsimg.jpademo.repository;

import com.testsimg.jpademo.model.Guardian;
import com.testsimg.jpademo.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author girishkumarkadambari
 */

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder().firstName("Girish Kumar")
                .emailId("girish99126@gmail.com")
                .lastName("Kadambari")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGardian(){
        Guardian guardian = Guardian.builder()
                .name("testerFather")
                .email("tester@gmail.com")
                .mobile("123123123")
                .build();
        Student student = Student.builder().firstName("Test")
                .emailId("test@gmail.com")
                .lastName("tester")
                .guardian(guardian)
                .build();

        studentRepository.save(student);


    }

}