package com.etiya.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.etiya.northwind.business.abstracts.OrderDetailService;
import com.etiya.northwind.business.responses.orderDetails.OrderDetailListResponse;
import com.etiya.northwind.dataAccess.abstracts.OrderDetailRepository;
import com.etiya.northwind.entities.concretes.OrderDetail;

@Service
public class OrderDetailManager implements OrderDetailService{

	private OrderDetailRepository orderDetailRepository;
	
	
	public OrderDetailManager(OrderDetailRepository orderDetailRepository) {
		super();
		this.orderDetailRepository = orderDetailRepository;
	}


	@Override
	public List<OrderDetailListResponse> getAll() {
		List<OrderDetail> result=orderDetailRepository.findAll();
		List<OrderDetailListResponse> response= new ArrayList<>();
		for(OrderDetail orderDetail : result)
		{
			OrderDetailListResponse detailListResponse=new OrderDetailListResponse();
			detailListResponse.setOrderId(orderDetail.getOrder().getOrderId());
			detailListResponse.setProductId(orderDetail.getProduct().getProductId());
			detailListResponse.setProductName(orderDetail.getProduct().getProductName());
			response.add(detailListResponse);
		}
		return response;
	}

}
