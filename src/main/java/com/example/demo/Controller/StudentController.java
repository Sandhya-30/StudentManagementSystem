package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Service.StudentServiceImpl;
import com.example.demo.entiy.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl service;
	
	@RequestMapping("/")
	public String getListOfStudents(Model model) {
		model.addAttribute("Students", service.getAllStudents());
		return "Students";
	}
	
	@RequestMapping("/new")
	public String addStudent(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		return "new_student";
	}
	@RequestMapping(value= "/students" ,method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";
		
	}
}
