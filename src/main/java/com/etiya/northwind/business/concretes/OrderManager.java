package com.etiya.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Service;

import com.etiya.northwind.business.abstracts.OrderService;
import com.etiya.northwind.business.responses.orders.OrderListResponse;
import com.etiya.northwind.dataAccess.abstracts.OrderRepository;
import com.etiya.northwind.entities.concretes.Order;

@Service
public class OrderManager implements OrderService{
	private OrderRepository orderRepository;

	public OrderManager(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	@Override
	public List<OrderListResponse> getAll() {
		List<Order> result= orderRepository.findAll();
		List<OrderListResponse> response=new ArrayList<>();
		for(Order order:result)
		{
			OrderListResponse listResponse=new OrderListResponse();
			listResponse.setCompanyName(order.getCustomer().getCompanyName());
			listResponse.setFirstName(order.getEmployee().getFirstName());
			listResponse.setLastName(order.getEmployee().getLastName());
			listResponse.setOrderId(order.getOrderId());
			response.add(listResponse);
		}
		return response;
	}
	
	

}
