package com.etiya.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.etiya.northwind.business.abstracts.EmployeeService;
import com.etiya.northwind.business.responses.employees.EmployeeListResponse;
import com.etiya.northwind.dataAccess.abstracts.EmployeeRepository;
import com.etiya.northwind.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	private EmployeeRepository employeeRepository;
	
	

	public EmployeeManager(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public List<EmployeeListResponse> getAll() {
		
		List<Employee> result= employeeRepository.findAll();
		List<EmployeeListResponse> response=new ArrayList<>();
		for(Employee employee:result)
		{
			EmployeeListResponse employeeListResponse=new EmployeeListResponse();
			employeeListResponse.setEmployeeId(employee.getEmployeeId());
			employeeListResponse.setFirstName(employee.getFirstName());
			employeeListResponse.setLastName(employee.getLastName());
			employeeListResponse.setTitle(employee.getTitle());
			response.add(employeeListResponse);
		}
		
		return response;
	}
	

}
