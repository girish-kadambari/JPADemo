package com.testsimg.jpademo.repository;

import com.testsimg.jpademo.model.Guardian;
import com.testsimg.jpademo.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author girishkumarkadambari
 */

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder().firstName("Girish Kumar").emailId("girish99126@gmail.com").lastName("Kadambari").build();

        studentRepository.save(student);
    }

    @Test
    public  void getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList.toString());
    }


    @Test
    public void saveStudentWithGardian() {
        Guardian guardian = Guardian.builder().name("testerFather").email("tester@gmail.com").mobile("123123123").build();
        Student student = Student.builder().firstName("Test").emailId("test@gmail.com").lastName("tester").guardian(guardian).build();

        studentRepository.save(student);

    }

    @Test
    public void findStudentByFirstName(){
        List<Student> studentList= studentRepository.findByFirstName("Girish Kumar");
        System.out.println("Student :"+studentList);

    }

    @Test
    public void findStudentByLastName(){
        List<Student> studentList= studentRepository.findByLastName("Kadambari");
        System.out.println("Student :"+studentList);
    }
    @Test
    public void findByFirstNameContaining(){
        List<Student> studentList= studentRepository.findByFirstNameContaining("tes");
        System.out.println("Student :"+studentList);
    }

    @Test
    public void findByFirstNameAndLastName(){
        List<Student> studentList= studentRepository.findByFirstNameAndLastName("Test","tester");
        System.out.println("Student :"+studentList);
    }


    @Test
    public void printGetStudentFirstNameByEmailAddress() {
        String firstName =
                studentRepository.getStudentFirstNameByEmailAddress(
                        "test@gmail.com"
                );
        System.out.println("firstName = " + firstName);
    }

    @Test
    public void printGetStudentByEmailAddressNative(){
        Student student =
                studentRepository.getStudentByEmailAddressNative(
                        "test@gmail.com"
                );

        System.out.println("student = " + student);
    }

    @Test
    public void printGetStudentByEmailAddressNativeNamedParam() {
        Student student =
                studentRepository.getStudentByEmailAddressNativeNamedParam(
                        "test@gmail.com"
                );

        System.out.println("student = " + student);
    }

    @Test
    public void updateStudentNameByEmailIdTest() {
        studentRepository.updateStudentNameByEmailId(
                "test",
                "test@gmail.com");
    }
}