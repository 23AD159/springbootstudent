package com.example.springbootstudent.services;

import com.example.springbootstudent.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServices {
    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Arun","CCE",8,"Gen AI"),
                    new Student(2,"Yamuna","AI-DS",9,"Full Stack")
            )
    );

    public List<Student> getMethod() {
        return students;
}
    public String postMethod(Student newStudent) {
        students.add(newStudent);
        return "Student added Successfully!";
    }
    public String putMethod(int id, Student updatestudent){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==id){
                students.set(i,updatestudent);
                return "Student with id "+id+" updated Successfully!";
            }
        }
        return "Student with id "+id+ " not found!";
    }
    public String deleteMethod(int id){
        for(int i=0;i<students.size();i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return "Student with id " + id + " deleted successfully!";
            }
        }
        return "Student with id "+id+" not found!";
    }
}
