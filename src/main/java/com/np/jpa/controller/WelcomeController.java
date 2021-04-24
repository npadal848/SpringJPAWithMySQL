package com.np.jpa.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/message")
	public String message() {
		return "Welcome "+Calendar.getInstance().getTime();
	}
}
