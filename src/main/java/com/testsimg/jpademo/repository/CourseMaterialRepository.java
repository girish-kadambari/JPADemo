package com.testsimg.jpademo.repository;

import com.testsimg.jpademo.model.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author girishkumarkadambari
 */

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {

}
