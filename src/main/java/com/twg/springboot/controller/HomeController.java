package com.twg.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.twg.sprinboot.entity.Employee;
import com.twg.springboot.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
    @GetMapping("/")
	public String insertEmployee(Model model)
	{
		Employee employee =new Employee();
		employee.setName("Rakesh");
		employee.setDesignation("Manger");
		employee.setDepartment("Accounts");
		employee.setExp(30);
		
		Employee emp=employeeService.saveEmployee(employee);
		
	
		String msg="Employee"+emp.getName()+"with id"+emp.getId()+"is saved successfuly";
		model.addAttribute("Employee", emp);
		model.addAttribute("message",msg);
		return "home";
	}
	

}
