package com.rpfb.portal.Reform.Portal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class UserData extends Object {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long U_Id;
	
	private String F_Name;
	private String L_Name;
	private String email;
	private String password;
	private String City;
	
	
	public long getU_Id() {
		return U_Id;
	}


	public void setU_Id(long u_Id) {
		this.U_Id = u_Id;
	}


	public String getF_Name() {
		return F_Name;
	}


	public void setF_Name(String f_Name) {
		this.F_Name = f_Name;
	}


	public String getL_Name() {
		return L_Name;
	}


	public void setL_Name(String l_Name) {
		this.L_Name = l_Name;
	}


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


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		this.City = city;
	}

	public UserData(String F_Name,String L_Name,String email,String password,String City) {
		this.F_Name=F_Name;
		this.L_Name=L_Name;
		this.email=email;
		this.password=password;
		this.City=City;
	}


	@Override
	public String toString() {
		return "UserData [U_Id=" + U_Id + ", F_Name=" + F_Name + ", L_Name=" + L_Name + ", email=" + email
				+ ", password=" + password + ", City=" + City + "]";
	}
	
}
