package com.litageview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.litageview.domain.Author;

@Controller
public class LiteraryWebApplicationMain {
	
//	@Autowired
//	Authors author;
	
	@RequestMapping("/")
	public String theHomepage() {
		return "homepage";
	}

	@PostMapping("/CreateWriterAccount")
	public String createWriterAccount(@RequestParam(value = "firstName", required = true) String firstName,
									  @RequestParam(value = "lastName", required = true) String lastName,
									  @RequestParam(value = "email", required = true) String email,
									  @RequestParam(value = "mobileNumber", required = true) int mobileNumber,
									  @RequestParam(value = "telephoneNumber", required = false) int telephoneNumber,
									  @RequestParam(value = "age", required = true) int age){
		
		return "";
	}
}
