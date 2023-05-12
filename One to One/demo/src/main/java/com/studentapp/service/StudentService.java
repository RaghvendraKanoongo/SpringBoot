package com.studentapp.service;

import com.studentapp.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int studentId);

    void getById(int studentId);
    List<Student> getAll();


}
