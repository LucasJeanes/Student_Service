package com.ie.student_service;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student/add/")
    public Student addStudent(@RequestBody Student studentInput) {
        Student newStudent = studentService.add(studentInput);
        return newStudent;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id) {
        return studentService.get(id);
    }
}
