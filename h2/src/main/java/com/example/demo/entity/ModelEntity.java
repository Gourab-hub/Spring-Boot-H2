package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class ModelEntity {
    @Id
    @Column(name="employeeId")
    private int employeeId;
    
    @Column(name="employeename")
    private String empoyeeName;
    
    @Column(name="salary")
    private String salary;
    
    @Column(name="city")
    private String city;
    
    @Column(name="pincode")
    private String pincode;
    
    @Column(name="contact")
    private String contact;
    
    @Column(name="primarySkill")
    private String primarySkill;
    
    @Column(name="secondarySkill")
    private String secondarySkill;
    
    
    
    public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
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

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	
    
    

}