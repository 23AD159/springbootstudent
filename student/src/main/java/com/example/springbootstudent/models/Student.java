package com.example.springbootstudent.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String Dept;
    private int CGPA;
    private String domain;
}