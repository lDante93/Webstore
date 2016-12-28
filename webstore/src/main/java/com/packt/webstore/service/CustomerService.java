package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.Product;

public interface CustomerService {
	List<Customer> getAllCustomers();
}
