package com.example.basic_crud.service;

import com.example.basic_crud.model.Student;
import com.example.basic_crud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getAllstudents() {
        return studentRepository.findAll();
    }

    public Student getstudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student studentInfo, Integer id) {
        Student student = getstudentById(id);

        student.setName(studentInfo.getName());
        student.setEmail(studentInfo.getEmail());
        return studentRepository.save(student);
    }

}
