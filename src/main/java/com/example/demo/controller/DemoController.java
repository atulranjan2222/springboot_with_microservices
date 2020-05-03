package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BaseModel;
import com.example.demo.model.CustomerModel;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/createcustomers")
	public ResponseEntity<CustomerModel> createCustomers(@RequestBody @Valid CustomerModel model) {
		System.out.println("in controller");
		ResponseEntity<CustomerModel> response = null;
		CustomerModel customerModel = null;
		System.out.println(">>>" + model.toString());
		customerModel = customerService.createCustomer(model);
		if (null != customerModel && StringUtils.isEmpty(customerModel.getErrorMessage())) {
			response = new ResponseEntity<CustomerModel>(customerModel, HttpStatus.OK);
		} else {
			response = new ResponseEntity<CustomerModel>(customerModel, HttpStatus.BAD_REQUEST);
		}

		return response;

	}
	@GetMapping("/customers")
	public ResponseEntity<List<CustomerModel>> getCustomers() {

		ResponseEntity<List<CustomerModel>> response = null;
		List<CustomerModel> customerModel = null;
		customerModel = customerService.getCustomers();
		if (null != customerModel && StringUtils.isEmpty(customerModel.get(0).getErrorMessage())) {
			response = new ResponseEntity<List<CustomerModel>>(customerModel, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<CustomerModel>>(customerModel, HttpStatus.BAD_REQUEST);
		}

		return response;

	}

}
