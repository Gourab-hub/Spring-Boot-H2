package com.example.demo.request;

import java.util.List;

public class EmployeRequest {

	private String employeeId;
	private String empoyeeName;
	private String salary;
	private List<Expertise> expertise;
	private String city;
	private String pincode;
	private String contact;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpoyeeName() {
		return empoyeeName;
	}
	public void setEmpoyeeName(String empoyeeName) {
		this.empoyeeName = empoyeeName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public List<Expertise> getExpertise() {
		return expertise;
	}
	public void setExpertise(List<Expertise> expertise) {
		this.expertise = expertise;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
}
