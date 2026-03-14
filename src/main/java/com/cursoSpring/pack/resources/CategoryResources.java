package com.cursoSpring.pack.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoSpring.pack.domain.Category;

@RestController
@RequestMapping(value="/categories")

public class CategoryResources {
	
	@GetMapping
	public List<Category> list() {
		Category c1 = new Category(1, "Informatica");
		Category c2 = new Category(2, "Escritorio");
		
		List<Category> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
			
		return lista;
	}

}
