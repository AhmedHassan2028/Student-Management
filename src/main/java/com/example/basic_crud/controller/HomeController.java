package com.example.basic_crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Student Management API is running!<br/><br/>" +
                "Available endpoints:<br/>" +
                "<a href='/api/students'>GET /api/students</a> - Get all students<br/>" +
                "POST /api/students - Create a student<br/>" +
                "GET /api/students/{id} - Get student by ID<br/>" +
                "PUT /api/students/{id} - Update student<br/>" +
                "DELETE /api/students/{id} - Delete student";
    }
}