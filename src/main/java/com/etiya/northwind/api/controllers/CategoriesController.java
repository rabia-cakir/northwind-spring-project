package com.etiya.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.northwind.business.abstracts.CategoryService;
import com.etiya.northwind.business.responses.categories.CategoryListResponse;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
	private CategoryService categoryService;

	public CategoriesController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping("/getall")
	public List<CategoryListResponse> getAll()
	{
		return categoryService.getAll();
	}
	
}
