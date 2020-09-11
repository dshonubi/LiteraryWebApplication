package com.litageview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LiteraryWebApplicationMain {
	
	@RequestMapping("/")
	public String theHomepage() {
		return "homepage";
	}

}
