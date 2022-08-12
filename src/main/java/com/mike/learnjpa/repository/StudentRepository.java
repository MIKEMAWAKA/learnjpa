package com.mike.learnjpa.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mike.learnjpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String firstName);

    // public List<Student> findByLasttNameNotNull();


    // //jpl query
    // @Query("Select s from Student s where s.emailId = ?1")
    // Student getStudentByEmailAddress(String emailId);


    // //native query
    // @Query(
    //     value = "Select s from Student s where s.emailId = ?1",
    //     nativeQuery = true
    //     )
    // Student getStudentByEmailAddressNative(String emailId);


    //  //native query by param
    //  @Query(
    //     value = "Select s from Student s where s.emailId = ?email_id",
    //     nativeQuery = true
    //     )
    // Student getStudentByEmailAddressNativeNamedParame(
    //     @Param("emailId") String emailId);


    // @Modifying
    // @Transactional  
    // @Query(
    //     value = "update s from Student s where s.emailId = ?email_id",
    //     nativeQuery = true
    //     )
    // int updateStudentNamedByEmailId(
    //         String emailId);
          
  


}
