package com.mycom.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	private String hello() {
		// TODO Auto-generated method stub
		return "Hello , AWS!";
	}
}
