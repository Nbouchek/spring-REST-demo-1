package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    // define endpoint for "/students" - return list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudents = new ArrayList<>();
        theStudents.add( new Student("Dad", "Nacer"));
        theStudents.add( new Student("Mum", "Linda"));
        theStudents.add( new Student("Son", "Adam"));
        theStudents.add( new Student("Daughter", "Hana"));

        return theStudents;
    }
}
