package com.etiya.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "suppliers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
	@Id
	@Column(name = "supplier_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@OneToMany(mappedBy = "supplier")
	private List<Product> products;

}
