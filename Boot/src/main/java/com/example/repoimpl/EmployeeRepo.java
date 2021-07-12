package com.example.repoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.service.IEmployeeService;

@Service
public class EmployeeRepo implements IEmployeeService {

	@Autowired
	EmployeeRepo repo;
	@Override
	public void saveEmployee(Employee E) {
		repo.saveEmployee(E);

	}

}
