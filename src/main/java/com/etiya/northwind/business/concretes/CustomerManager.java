package com.etiya.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.etiya.northwind.business.abstracts.CustomerService;
import com.etiya.northwind.business.responses.customers.CustomerListResponse;
import com.etiya.northwind.dataAccess.abstracts.CustomerRepository;
import com.etiya.northwind.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService {
	private CustomerRepository customerRepository;

	public CustomerManager(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<CustomerListResponse> getAll()
	{
		List<Customer> result=customerRepository.findAll();
		List<CustomerListResponse> response=new ArrayList<>();
		for(Customer customer:result)
		{
			CustomerListResponse customerListResponse=new CustomerListResponse();
			customerListResponse.setAddress(customer.getAddress());
			customerListResponse.setCity(customer.getCity());
			customerListResponse.setCompanyName(customer.getCompanyName());
			customerListResponse.setCustomerId(customer.getCustomerId());
			response.add(customerListResponse);
		}
		
		return response;
	}
	
}
