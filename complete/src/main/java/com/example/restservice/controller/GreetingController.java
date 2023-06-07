package com.example.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.bean.Greeting;
import com.example.restservice.service.GreetingService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GreetingController {
	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "id", defaultValue = "1") String id
		,	@RequestParam(value = "name", defaultValue = "name") String name
		,	@RequestParam(value = "completed", defaultValue = "0") int completed) {
		Greeting greeting = new Greeting();
		greeting = greetingService.selectAll();
		System.out.println("greeting:" + greeting);
		return greeting;
	}
}
