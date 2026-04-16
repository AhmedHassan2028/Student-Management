package com.example.basic_crud.controller;

import com.example.basic_crud.model.Student;
import com.example.basic_crud.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
    }

    @GetMapping("")
    public List<Student> getAllStudents() {
        return studentService.getAllstudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getstudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(Student student, Integer id) {
        return studentService.updateStudent(student, id);
    }
}
