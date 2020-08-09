package com.example.demo.model;

import java.io.Serializable;

public class JwtAutherizationResponse  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6003834942131256848L;
	private String jwtToken;

	public JwtAutherizationResponse() {

	}

	public JwtAutherizationResponse(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	@Override
	public String toString() {
		return "JwtAutherizationResponse [jwtToken=" + jwtToken + "]";
	}

}
