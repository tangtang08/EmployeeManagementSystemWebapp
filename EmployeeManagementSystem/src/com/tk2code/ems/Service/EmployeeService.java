package com.tk2code.ems.Service;

import java.util.List;

import com.tk2code.ems.entity.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();


	public void saveEmployee(Employee theEmployee);
	
	public Employee getEmployee(int theId);
	
	public void deleteEmployee(int theId);
}