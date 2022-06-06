package com.testsimg.jpademo.repository;

import com.testsimg.jpademo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author girishkumarkadambari
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String firstName);

    public List<Student> findByLastName(String lastName);

    public  List<Student> findByFirstNameContaining(String name);

    public  List<Student> findByFirstNameAndLastName(String firstName,String lastName);

}
