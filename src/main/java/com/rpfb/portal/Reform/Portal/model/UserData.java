package com.rpfb.portal.Reform.Portal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component

@Entity (name = "ESD_USER")

public class UserData extends Object {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long U_Id;
	
	
	@Column(name = "F_Name")
	private String F_Name;
	
	@Column(name = "L_Name")
	private String L_Name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "City")
	private String City;
	
	@Column(name = "created_on")
	private String Time;
	
	@Column(name = "updated_on")
	private String updatedTime;
	
	public String getUpdatedTime() {
		return updatedTime;
	}


	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}


	public UserData(){
		
	}
	
	
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

	public String getcreationTime() {
		return Time;
	}


	public void setcreationTime(String time) {
		this.Time = time;
	}
	
	
	
	public UserData(String F_Name,String L_Name,String email,String password,String City, String Time, String updatedTime) {
		this.F_Name=F_Name;
		this.L_Name=L_Name;
		this.email=email;
		this.password=password;
		this.City=City;
		this.Time=Time;
		this.updatedTime=updatedTime;
	}


	@Override
	public String toString() {
		return "UserData [U_Id=" + U_Id + ", F_Name=" + F_Name + ", L_Name=" + L_Name + ", email=" + email
				+ ", password=" + password + ", City=" + City + ", Time=" + Time + ", updatedTime " + updatedTime + "]";
	}



	
}
