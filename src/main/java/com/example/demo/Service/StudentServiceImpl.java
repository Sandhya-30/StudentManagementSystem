package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.entiy.Student;

@Service
public class StudentServiceImpl implements studentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		return repo.findAll() ;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

}
