package com.rpfb.portal.Reform.Portal.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component

@Entity (name = "ESD_USER_LOGIN")

public class LoginResponse {
	
	@Id
	private String email;
	
	private String password;
	
	private String createdTime;
	
	private String updatedTime;

	
	
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
public LoginResponse(){
		
	}
	
	public LoginResponse(String email,String password,String createdTime, String updatedTime) {

		this.email=email;
		this.password=password;
		this.createdTime=createdTime;
		this.updatedTime=updatedTime;
	}


	@Override
	public String toString() {
		return "LoginResponse [email=" + email + ", password=" + password + ", createdTime=" + createdTime + ", updatedTime " + updatedTime + "]";
	}
	
}
