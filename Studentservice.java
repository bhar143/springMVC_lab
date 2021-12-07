package com.greatlearning.springMVC.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.springMVC.entity.Students;



@Service
public interface Studentservice {
	
public List<Students> findAll();
	
	public  Students findById(int id);
	
	public void save(Students student);
	
	public void deletedById(int id);

}
