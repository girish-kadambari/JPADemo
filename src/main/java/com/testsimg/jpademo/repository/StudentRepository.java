package com.testsimg.jpademo.repository;

import com.testsimg.jpademo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author girishkumarkadambari
 */
public interface StudentRepository extends JpaRepository<Student,Long> {

}
