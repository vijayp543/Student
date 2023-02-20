package com.vijay.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.model.Employee;
import com.vijay.repo.EmployeeRepo;

@RestController

public class EmployeeController  {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return empRepo.save(emp);
	}
	
	
	
	
	
	

}
