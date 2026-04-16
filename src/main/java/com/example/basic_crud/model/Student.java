package com.example.basic_crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data                    // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor       // Generates default constructor
@AllArgsConstructor      // Generates constructor with all fields
@Builder                 // Adds builder pattern
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false, unique = true)
    private String email;

}
