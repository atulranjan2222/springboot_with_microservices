package com.example.demo.model;

import javax.validation.constraints.Pattern;

import com.example.demo.util.DataValidation;

public class CustomerAddressModel {
	private String addressLine1;
	private String city;
	private String state;
	private String country;
	@Pattern(regexp = DataValidation.ZIP_CHECK,message = "zip is incorrect")
	private String zip;

	public CustomerAddressModel(String addressLine1, String city, String state, String country, String zip) {
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	public CustomerAddressModel() {

	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "CustomerAddress [addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zip=" + zip + "]";
	}

}
