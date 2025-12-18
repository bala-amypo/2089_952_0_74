package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    private final StudentService ss;

    public StudentController(StudentService ss) {
        this.ss = ss;
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student s) {
        return ss.postStudent(s);
    }
}

