package com.etiya.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.etiya.northwind.business.abstracts.SupplierService;
import com.etiya.northwind.business.responses.suppliers.SupplierListResponse;
import com.etiya.northwind.dataAccess.abstracts.SupplierRepository;
import com.etiya.northwind.entities.concretes.Supplier;

@Service
public class SupplierManager implements SupplierService{
	private SupplierRepository supplierRepository;
	
	
	public SupplierManager(SupplierRepository supplierRepository) {
		super();
		this.supplierRepository = supplierRepository;
	}


	@Override
	public List<SupplierListResponse> getAll() {
		List<Supplier> result=supplierRepository.findAll();
		List<SupplierListResponse> response=new ArrayList<>();
		for(Supplier supplier:result)
		{
			SupplierListResponse supplierListResponse=new SupplierListResponse();
			supplierListResponse.setAddress(supplier.getAddress());
			supplierListResponse.setCity(supplier.getCity());
			supplierListResponse.setCompanyName(supplier.getCompanyName());
			supplierListResponse.setProductId(supplier.getProductId());
			response.add(supplierListResponse);
		}
		return response;
	}
	

}
