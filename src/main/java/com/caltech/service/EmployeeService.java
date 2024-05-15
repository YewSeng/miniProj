package com.caltech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caltech.pojo.Employee;
import com.caltech.repository.EmployeeRepository;



@Service
public class EmployeeService {
	//it creates an object with some reference to the dummy obj
	@Autowired
	EmployeeRepository repo;
	//insert
	public Employee insert(Employee e) {
		return repo.save(e);
	}
	
	//retrive
	public List<Employee> getall(){
	return repo.findAll();
	}

}

