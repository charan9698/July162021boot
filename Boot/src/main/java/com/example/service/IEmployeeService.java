package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Employee;

@Service
public interface IEmployeeService {
	
	void saveEmployee(Employee E);

}
