package com.tk2code.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tk2code.ems.Service.EmployeeService;
import com.tk2code.ems.entity.Employee;

@Controller
public class EmployeeController {
	
@Autowired
private EmployeeService employeeService;

@RequestMapping("/list")
public String listEmployees(Model theModel){
	
	//retrieve employees
	List<Employee> theEmployees = employeeService.getEmployees();
	
	//add employee to model
	theModel.addAttribute("employees", theEmployees);
	
	return "EmployeeList";
}

@RequestMapping("/EmployeeAdditionForm")
public String EmployeeAddition(Model theModel){
	
	//model attribute
	Employee theEmployee = new Employee();
	theModel.addAttribute("employee", theEmployee);
	
	//calling the jsp page... look in the view folder... which is in the WEB-INF folder
	return "employeeaddform";
}

@RequestMapping ("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
	//saving employee in service
		employeeService.saveEmployee(theEmployee);
		
		return "redirect:/list";
}

@RequestMapping("/EmployeeUpdateForm")
public String employeeUpdateForm(@RequestParam("employeeId")
int theId, Model theModel)
{
	
	//get employee from our service
	Employee theEmployee=employeeService.getEmployee(theId);
	
	//prepopulated form by setting up model attribute as employee 
	theModel.addAttribute("employee", theEmployee);
	
	//send values to form
	return "employeeaddform";
	
	
}

@RequestMapping("/EmployeeDeleteForm")
public String employeeDeleteForm(@RequestParam("employeeId")
int theId, Model theModel)
{
	
	//delete employee
	employeeService.deleteEmployee(theId);
	
	return "redirect:/list";
	
	
	
}
	{
		
	}
}