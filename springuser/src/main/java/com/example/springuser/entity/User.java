package com.example.springuser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;
	
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public int Userpass() {
		return Userpass();
	}
	public void setUserpass(int userpass) {
		this.userpass = userpass;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", usertype=" + usertype + ", userpass=" + userpass
				+ "]";
	}
	private String username;
	private String usertype;
	private int userpass;
	
}