package com.AshuIt.SpringMvcCrudUsingDataJpa.Model;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="User_Details")
public class User {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_Id")
	private int Userid;
	@Column(name="User_Firstname")
	private String fname;
	@Column(name="User_Lastname")
	private String lname;
	@Column(name="User_Email")
	private String email;
	@Column(name="User_Username")
	private String username;
	@Column(name="User_Password")
	private String password;
	@Column(name="User_Address")
	private String useraddress;
	@Column(name="User_Age")
	private int Userage;
	
	
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public int getUserage() {
		return Userage;
	}
	public void setUserage(int userage) {
		Userage = userage;
	}
	@Override
	public String toString() {
		return "User [Userid=" + Userid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", username="
				+ username + ", password=" + password + ", useraddress=" + useraddress + ", Userage=" + Userage + "]";
	}
	
	
	
	
	
}
