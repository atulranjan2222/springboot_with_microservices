package com.example.demo.model;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.example.demo.util.DataValidation;

public class CustomerModel extends BaseModel {
	@NotEmpty(message = "customerCode Required")
	private String customerCode;
	@NotEmpty(message = "firstName Required")
	private String firstName;
	private String middleName;
	@NotEmpty(message = "lastName Required")
	private String lastName;
	private String gender;
	@NotEmpty(message = "email Required")
	@Email(message = "please enter valid email")
	private String email;
	@NotEmpty(message = "mobile Required")
	@Pattern(regexp = DataValidation.PHONE_CHECK)
	private String mobile;
	@Valid
	private CustomerAddressModel  address;

	public CustomerModel() {

	}

	public CustomerModel(String customerCode, String firstName, String middleName, String lastName, String gender,
			String email, String mobile, CustomerAddressModel address) {
		super();
		this.customerCode = customerCode;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public CustomerAddressModel getAddress() {
		return address;
	}

	public void setAddress(CustomerAddressModel address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerModel [customerCode=" + customerCode + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", gender=" + gender + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

}
