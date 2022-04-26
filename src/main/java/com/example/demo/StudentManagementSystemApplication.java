package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.entiy.Student;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student s1=new Student("Sandhya","Modulla","sandhyamodulla@gmail.com");
//		Student s2=new Student("Varun Sir","Gontla","varungontla@sir.com");
//		
//		repo.save(s1);
//		repo.save(s2);
		
	}

}
