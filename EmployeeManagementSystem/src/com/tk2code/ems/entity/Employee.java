package com.tk2code.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee") 
public class Employee {
	
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY) //for increment)
@Column(name="id")
private int id;

@Column(name="firstName")
private String firstName;
	

@Column(name="lastName")
private String lastName;
	
	
@Column(name="emailId")
private String emailId;

@Column(name="contactNumber")
private String contactNumber;

@Column(name="department")
private String department;
	
public Employee(){

}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getContactNumber() {
	return contactNumber;
}

public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;

}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
			+ ", contactNumber=" + contactNumber + ", department=" + department + "]";
}
}
