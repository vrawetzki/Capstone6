package com.capstone6practice.capstone6practice.variablesnikki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer userid;
	private String description;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(Integer id, Integer userid, String description) {
		super();
		this.id = id;
		this.userid = userid;
		this.description = description;
	}

	public Task(Integer userid, String description) {
		super();
		this.userid = userid;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Task id=" + id + ", userid=" + userid + ", description=" + description;
	}

}
