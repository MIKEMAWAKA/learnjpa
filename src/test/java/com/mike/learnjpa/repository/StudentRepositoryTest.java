package com.mike.learnjpa.repository;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mike.learnjpa.entity.Guardian;
import com.mike.learnjpa.entity.Student;



@SpringBootTest

public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    // @Test
    // public void saveStudent(){
    //     Student student = Student.builder()
    //          .emailId("mike@gmail.com")
    //          .firstName("mike")
    //          .lastName("MUSSA")
    //         //  .guardianEmail("mussa@gmail.com")
    //         //  .guardianMobile("072883838")
    //         //  .guardianName("mussa")
    //          .build();


    //     studentRepository.save(student) ;  
             
        
    // }

    @Test
    public void saveStudentWithGuardian(){
     Guardian guardian = Guardian.builder()
            .email("moses@gmail.com")
            .name("moses")
            .mobile("028222772882")
            .build();


      Student studentd = Student.builder()
            .emailId("bmdike@gmail.com")
            .firstName("mike")
            .lastName("MUSSA")
            .guardian(guardian)
            .build();

        studentRepository.save(studentd);    
    }

    @Test
    public void printAllStudent(){
        List<Student> studentlist = studentRepository.findAll();

        System.out.println("studentList = "+studentlist);


       
    }

    @Test
    public void printByFirstName() {
        List<Student> studentlist = studentRepository.findByFirstName("mike");

        System.out.println("studentList = "+studentlist);
            
    }

    // @Test
    // public void printByLastName() {
    //     List<Student> studentlist = studentRepository.findByLasttNameNotNull();

    //     System.out.println("studentList = "+studentlist);
            
    // }

    // @Test
    // public void printStudentByEmailAdress() {
    //     Student student = studentRepository.getStudentByEmailAddress("bmike@gmail.com");

    //     System.out.println("studentList = "+student);
            
    // }

}
