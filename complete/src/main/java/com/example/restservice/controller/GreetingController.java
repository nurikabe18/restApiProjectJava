package com.example.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.bean.Greeting;
import com.example.restservice.bean.GreetingList;
import com.example.restservice.service.GreetingService;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
public class GreetingController {
	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greeting")
	public List<Greeting> greeting(
			@RequestParam(value = "id", defaultValue = "1") String id
		,	@RequestParam(value = "name", defaultValue = "name") String name
		,	@RequestParam(value = "completed", defaultValue = "0") int completed) {
		GreetingList greetingList = new GreetingList();
		greetingList.setGreetingList(greetingService.selectAll());
		System.out.println("greeting:" + greetingList);
		return greetingList.getGreetingList();
	}
}
