package com.example.demo.model;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import com.example.demo.util.DataValidation;

public class CustomerModel {
	private String customerCode;
	private String customerName;
	@Pattern(regexp = DataValidation.PHONE_CHECK,message = "customerPhone is invalid")
	private String customerPhone;
	@Email(message = "customerEmail is invalid")
	private String customerEmail;
	@Valid
	private CustomerAddressModel address;

	public CustomerModel(String customerCode, String customerName, String customerPhone, String customerEmail,
			CustomerAddressModel address) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.address = address;
	}

	public CustomerModel() {

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

	public CustomerAddressModel getAddress() {
		return address;
	}

	public void setAddress(CustomerAddressModel address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerModel [customerCode=" + customerCode + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", customerEmail=" + customerEmail + ", address=" + address + "]";
	}

}
