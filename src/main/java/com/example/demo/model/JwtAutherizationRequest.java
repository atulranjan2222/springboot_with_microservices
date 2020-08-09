package com.example.demo.model;

import java.io.Serializable;

public class JwtAutherizationRequest  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6582165881684365828L;
	private String userName;
	private String password;

	public JwtAutherizationRequest() {

	}

	public JwtAutherizationRequest(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JwtAutherizationRequest [userName=" + userName + ", password=" + password + "]";
	}

}
