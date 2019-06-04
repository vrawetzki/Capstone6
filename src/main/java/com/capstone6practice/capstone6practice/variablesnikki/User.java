package com.capstone6practice.capstone6practice.variablesnikki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String address;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String address, String password) {
		super();
		this.id = id;
		this.address = address;
		this.password = password;
	}

	public User(String address, String password) {
		super();
		this.address = address;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User id=" + id + ", address=" + address + ", password=" + password;
	}

}
