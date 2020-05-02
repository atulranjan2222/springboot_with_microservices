package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CustomerModel;

public interface CustomerService {
	public CustomerModel createCustomer(CustomerModel model);
	
	public List <CustomerModel> getCustomers();

}
