package com.jsp.Servlet.School.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int admin_id;
	
	@Column(name = "name",nullable = false)
	private String admin_name;
	
	@Column(name = "gender",updatable = false,nullable = false)
	private boolean admin_gender;
	
	@Column(name = "username",nullable = false,unique = true)
	private String admin_username;
	
	@Column(name = "password",nullable = false)
	private String admin_password;

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public boolean getAdmin_gender() {
		return admin_gender;
	}

	public void setAdmin_gender(boolean admin_gender) {
		this.admin_gender = admin_gender;
	}

	public String getAdmin_username() {
		return admin_username;
	}

	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public Admin() {

	}
	
	
	
	
	
	
	
	
	
}
