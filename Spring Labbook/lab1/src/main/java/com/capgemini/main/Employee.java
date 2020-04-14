package com.capgemini.main;

import org.springframework.beans.factory.annotation.Autowired;
import com.capgemini.main.SBU;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	SBU sbu;
	
	Employee()
	{
		System.out.println("Employee Details.. ");
	}
	
	public void getEmployeeId() 
	{
		System.out.println( "Employee Id: "+employeeId);
	}
	
	@Autowired
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public void getEmployeeName() 
	{
		System.out.println("Employee Name: "+employeeName);
	}
	
	@Autowired
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	public void getSalary()
	{
		System.out.println("Employee salary: "+ salary);
	}
	
	@Autowired
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void getBusinessUnit() 
	{
		System.out.println("Employee BU: "+ businessUnit);
	}
	
	@Autowired
	public void setBusinessUnit(String businessUnit) 
	{
		this.businessUnit = businessUnit;
	}
	public void getAge() 
	{
		System.out.println("Emplpoyee Age: " +age);
	}
	
	@Autowired
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getempDetails() 
	{
		return "[Age: " + age + " EmployeeId: " + employeeId + " Employeename : " + employeeName + " EmplyeeSalary : "+ salary+ "]";
	}
	
	void show()
	{
		System.out.println(getempDetails());
		System.out.println("SBU Details..");
		System.out.println("[sbuCode : "+businessUnit+ " " +sbu.getSbuDetails());
	}
	
	public SBU getSbu() 
	{
		return sbu;
	}
	
	@Autowired
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}

}
