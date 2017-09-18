package com.tk2code.ems.dao;

import java.util.List;
import com.tk2code.ems.entity.*;

public interface EmployeeDAO {

	//Employee is the name of table
	public List<Employee> getEmployees();
	public void saveEmployee(Employee theEmployee);
	
	
	public Employee getEmployee(int theId);
	
	public void deleteEmployee(int theId);
}
