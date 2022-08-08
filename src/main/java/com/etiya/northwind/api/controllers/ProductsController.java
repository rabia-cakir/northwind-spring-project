package com.etiya.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.northwind.business.abstracts.ProductService;
import com.etiya.northwind.business.responses.products.ProductListResponse;
import com.etiya.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		this.productService = productService;
	}
	
	
	@GetMapping("/getall")
	public List<ProductListResponse> getAll()
	{
		return productService.getAll();
	}
	
}
