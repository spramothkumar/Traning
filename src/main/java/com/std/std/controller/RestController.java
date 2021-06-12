package com.std.std.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.std.std.data.Student;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/std")
	public Student getStudent() {
		Student data = new Student();
		data.setName("Pramoth");
		data.setAge(29L);
		data.setGender("Male");
		return data;
	}
	
	@PostMapping("/std")
	public Student addStudent(@RequestBody Student std) {
		System.out.println("STD Name : " + std.getName());
		return std;
	}
	
}
