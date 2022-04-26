package com.example.demo.Service;

import java.util.List;

import com.example.demo.entiy.Student;

public interface studentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
}
