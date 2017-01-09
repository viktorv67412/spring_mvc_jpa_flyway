package com.service;

import com.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Object getStudentByName(String name);

    void addStudent(Student student);
}
