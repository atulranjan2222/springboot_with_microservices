package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CustomerModel;

@RestController
@RequestMapping("/demo")
public class DemoController {


	@PostMapping("/test")
	public ResponseEntity<CustomerModel> testController( @ RequestBody @Valid CustomerModel model) {
		System.out.println("in controller");
		ResponseEntity<CustomerModel> response = null;
		System.err.println("kkk");
		
		if (model != null) {
			System.out.println(">>>"+model.toString());
			response = new ResponseEntity<CustomerModel>(model, HttpStatus.OK);
		}
		return response;

	}

}
