package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TestModel;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@PostMapping("/test")
	public ResponseEntity<TestModel> testController( @ RequestBody @Valid TestModel model) {
		System.out.println("in controller");
		ResponseEntity<TestModel> response = null;
		if (model != null) {
			System.out.println(">>>"+model.toString());
			response = new ResponseEntity<TestModel>(model, HttpStatus.OK);
		}
		return response;

	}

}
