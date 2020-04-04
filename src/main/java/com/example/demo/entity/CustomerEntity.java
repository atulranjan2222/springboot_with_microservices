package com.example.demo.entity;

import java.io.Serializable;

public class CustomerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -656973805794852631L;

	private String customerCode;
	private String customerName;
	private String customerPhone;
	private String customerEmail;
	private String addressLine1;
	private String city;
	private String state;
	private String country;
	private String zip;

	public CustomerEntity(String customerCode, String customerName, String customerPhone, String customerEmail,
			String addressLine1, String city, String state, String country, String zip) {
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	public CustomerEntity() {
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
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
		return "CustomerEntity [customerCode=" + customerCode + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", customerEmail=" + customerEmail + ", addressLine1=" + addressLine1 + ", city="
				+ city + ", state=" + state + ", country=" + country + ", zip=" + zip + "]";
	}

}
