package com.etiya.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.northwind.business.abstracts.OrderDetailService;
import com.etiya.northwind.business.responses.orderDetails.OrderDetailListResponse;

@RestController
@RequestMapping("/api/orderdetails")
public class OrderDetailsContoller {
	private OrderDetailService orderDetailService;

	public OrderDetailsContoller(OrderDetailService orderDetailService) {
		super();
		this.orderDetailService = orderDetailService;
	}
	

	@GetMapping("/getall")
	public List<OrderDetailListResponse> getAll()
	{
		return orderDetailService.getAll();
	}
	

	
}
