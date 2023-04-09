package com.ap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/")
	public String welcome() {
		return "<h2> WELCOME AKSHAY PATIL</h2>";
	}

	
	@GetMapping("/admin")
	public String getAdmin() {
		return "<h2> WELCOME ADMIN .....!</h2>";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "<h2> WELCOME USER.....! </h2>";
	}
}
