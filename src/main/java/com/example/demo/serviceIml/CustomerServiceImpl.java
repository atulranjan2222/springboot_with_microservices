package com.example.demo.serviceIml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.mappers.BeanMAppers;
import com.example.demo.model.CustomerModel;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
@Service
@Transactional

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private BeanMAppers beanMappers;

	@Override
	public CustomerModel createCustomer(CustomerModel model) {
		CustomerModel modelResponse = null;
		CustomerEntity entityRequest = null;
		CustomerEntity entityResponse = null;
		try {
			entityRequest = beanMappers.modelToEntity(model);
			entityResponse = customerRepository.save(entityRequest);
			modelResponse = beanMappers.entityToModel(entityResponse);
		} catch (Exception e) {
			System.out.println("excption occured" + e.getMessage());
			modelResponse = new CustomerModel();
			modelResponse.setErrorMessage(e.getMessage());
		}
		return modelResponse;
	}

	@Override
	public List<CustomerModel> getCustomers() {
		List<CustomerEntity> responseEntity = null;
		List<CustomerModel> responseModel = null;
		try {
			responseEntity = customerRepository.findAll();
			responseModel = beanMappers.entityToModelList(responseEntity);
		} catch (Exception e) {
			System.out.println("excption occured" + e.getMessage());
			responseModel = new ArrayList<CustomerModel>();
			CustomerModel customer = new CustomerModel();
			customer.setErrorMessage(e.getMessage());
			responseModel.add(customer);
		}
		return responseModel;
	}

}
