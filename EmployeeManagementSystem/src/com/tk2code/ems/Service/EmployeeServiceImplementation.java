package com.tk2code.ems.Service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tk2code.ems.dao.EmployeeDAO;
import com.tk2code.ems.entity.*;

@Service
public class EmployeeServiceImplementation implements  EmployeeService{
	
@Autowired
private EmployeeDAO employeeDAO;

@Transactional
public List<Employee> getEmployees(){
	return employeeDAO.getEmployees();
}
@Transactional
public void saveEmployee(Employee theEmployee){
employeeDAO.saveEmployee (theEmployee);
}
@Override
@Transactional
public Employee getEmployee(int theId){
	return employeeDAO.getEmployee(theId);
}
@Transactional
public  void  deleteEmployee(int theId){
	
	
	
	 employeeDAO.deleteEmployee(theId);
}
}

