package com.example.basic_crud.repository;

import com.example.basic_crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findByEmail(String name);
}
