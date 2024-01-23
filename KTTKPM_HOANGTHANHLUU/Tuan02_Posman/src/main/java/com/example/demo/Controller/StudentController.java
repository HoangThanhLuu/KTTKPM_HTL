package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentServics;
	
	@PostMapping("/addStudent")
	public Student 	postDetails(@RequestBody Student student) {
		return studentServics.saveDetail(student);//tra du lieu post ve cho service de dua du lieu vao data thong qua service va repository
	}

}
