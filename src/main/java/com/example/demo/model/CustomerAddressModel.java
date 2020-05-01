package com.example.demo.model;

import javax.validation.constraints.Pattern;

import com.example.demo.util.DataValidation;

public class CustomerAddressModel {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	@Pattern(regexp = DataValidation.ZIP_CHECK)
	private String zipCode;

	public CustomerAddressModel() {

	}

	public CustomerAddressModel(String addressLine1, String addressLine2, String city, String state, String country,
			String zipCode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "CustomerAddressModel [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
	}

}
