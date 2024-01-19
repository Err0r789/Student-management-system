package com.jsp.Servlet.School.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name",nullable = false)
	private String student_name;
	
	@Column(name = "age",nullable = false)
	private int student_age;
	
	@Column(name = "contact",nullable = false)
	private String student_contact;
	
	@Column(name = "address")
	private String student_address;
	
	@Column(name = "gender",nullable = false,updatable = false)
	private boolean student_gender;
	
	@Column(name = "gmail")
	private String student_gamil;
	
	@Column(name = "username",nullable = false,unique = true)
	private String student_user;
	
	@Column(name = "password",nullable = false)
	private String student_pass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

	public String getStudent_contact() {
		return student_contact;
	}

	public void setStudent_contact(String student_contact) {
		this.student_contact = student_contact;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public boolean isStudent_gender() {
		return student_gender;
	}

	public void setStudent_gender(boolean student_gender) {
		this.student_gender = student_gender;
	}

	public String getStudent_gamil() {
		return student_gamil;
	}

	public void setStudent_gamil(String student_gamil) {
		this.student_gamil = student_gamil;
	}

	public String getStudent_user() {
		return student_user;
	}

	public void setStudent_user(String student_user) {
		this.student_user = student_user;
	}

	public String getStudent_pass() {
		return student_pass;
	}

	public void setStudent_pass(String student_pass) {
		this.student_pass = student_pass;
	}

	public Student() {

	}
	
	
}
