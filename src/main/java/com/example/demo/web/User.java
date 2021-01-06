package com.example.demo.web;

public class User {

	private String userName;
	private String email;
	private String userId;
	private String password;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", userId=" + userId + ", password=" + password + "]";
	}

}
