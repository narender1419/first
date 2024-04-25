package com.twg.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.twg.sprinboot.entity.Employee;
import com.twg.springboot.repository.EmployeeRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class Employeeserviceimp implements EmployeeService {
 
	
	@Autowired
	private EmployeeRepository  employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
	
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);
	}

	@Override
	public Employee findById(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
