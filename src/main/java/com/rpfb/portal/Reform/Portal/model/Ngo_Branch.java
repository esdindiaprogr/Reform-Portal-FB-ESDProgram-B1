package com.rpfb.portal.Reform.Portal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Ngo_Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long U_Id;
	
	private String Branch_Name;
	private String Address;
	
	private String Type;
	
	private String Person_Name;
	private long Mob_No;
	private String Email;
	public long getU_Id() {
		return U_Id;
	}
	public void setU_Id(long u_Id) {
		U_Id = u_Id;
	}
	public String getBranch_Name() {
		return Branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		Branch_Name = branch_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getPerson_Name() {
		return Person_Name;
	}
	public void setPerson_Name(String person_Name) {
		Person_Name = person_Name;
	}
	public long getMob_No() {
		return Mob_No;
	}
	public void setMob_No(long mob_No) {
		Mob_No = mob_No;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

	
}
