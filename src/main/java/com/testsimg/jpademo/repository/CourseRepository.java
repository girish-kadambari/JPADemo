package com.testsimg.jpademo.repository;

import com.testsimg.jpademo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author girishkumarkadambari
 */

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
