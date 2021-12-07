package com.greatlearning.springMVC.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String department;
	
	private String Country;
	
	public Students() {
		
	}
	
	public Students(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		Country = country;
	}



	public Students(int id, String name, String department, String country) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		Country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", department=" + department + ", Country=" + Country + "]";
	}
	
	
	


}


