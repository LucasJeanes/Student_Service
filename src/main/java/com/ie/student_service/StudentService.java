package com.ie.student_service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student add(Student studentInput) {
        Student newStudent = studentRepository.save(studentInput);
        return newStudent;
    }

    public Student get(String id) {
        return studentRepository.findById(id);
    }
}
