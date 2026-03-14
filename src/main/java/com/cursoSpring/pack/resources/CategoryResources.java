package com.cursoSpring.pack.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categories")

public class CategoryResources {
	
	@GetMapping
	public String list() {
		return "REST is working correctly!";
	}

}
