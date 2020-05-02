package com.example.demo.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {
	protected String errorMessage;

	public BaseModel(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public BaseModel() {
		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "BaseModel [errorMessage=" + errorMessage + "]";
	}
	
	

}
