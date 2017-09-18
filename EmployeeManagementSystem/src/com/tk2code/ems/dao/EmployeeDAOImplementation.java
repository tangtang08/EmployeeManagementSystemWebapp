package com.tk2code.ems.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tk2code.ems.entity.Employee;
import java.util.List;
import com.tk2code.ems.entity.*;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO{

	//Injecting Session Factory as dependency injection
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional	
	@Override
	public List<Employee> getEmployees() {
		
		//get hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create query
		Query<Employee> myQuery = currentSession.createQuery("From Employee", Employee.class);
		
		//execute query
		List<Employee> employees = myQuery.getResultList();
		
		return employees;		
	}
	
	@Override
	public void saveEmployee (Employee theEmployee){
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theEmployee);
	}
	@Override
	public Employee getEmployee(int theId){
		//hibernate session
		
		Session currentSession=sessionFactory.getCurrentSession();
		
		//reading record with employeeid
		Employee theEmployee = currentSession.get(Employee.class, theId);
		
		return theEmployee;
}
	@Override
	public void deleteEmployee(int theId){
		
		Session currentSession= sessionFactory.getCurrentSession();
		
		//delete employee object with employee id as primary key
		
		Query myQuery= currentSession.createQuery("delete from Employee where id=:employeeId");
		
		myQuery.setParameter("employeeId", theId);
		
		myQuery.executeUpdate();
	}
	}
