package com.packt.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.CustomerRepository;
import com.packt.webstore.domain.repository.ProductRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	private List<Customer> listOfCustomers = new ArrayList<Customer>();

	public InMemoryCustomerRepository() {
		Customer cust1 = new Customer();
		cust1.setCustomerId(1);
				
		cust1.setName("Łukasz Franczyk");
		cust1.setAddress("Żeromskiego 102");
	
	
		listOfCustomers.add(cust1);
	}

	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}
	
}