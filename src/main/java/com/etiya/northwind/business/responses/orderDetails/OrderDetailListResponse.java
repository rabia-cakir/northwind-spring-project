package com.etiya.northwind.business.responses.orderDetails;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailListResponse {

	private int orderId;
	private int productId;
	private String productName;


}
