package com.capgemini.main;

import java.util.List;

import com.capgemini.main.Employee;

public class SBU 
{
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	List <Employee> empList;
	
	public void setSbuId(int sbuId) 
	{
		this.sbuId = sbuId;
	}
	public void getSbuId() 
	{
		System.out.println("sbuCode: " + sbuId);
	}
	
	public void setSbuName(String sbuName) 
	{
		this.sbuName = sbuName;
	}
	public void getSbuName() 
	{
		System.out.println("SbuName: " +sbuName);
	}
	
	public void setSbuHead(String sbuHead) 
	{
		this.sbuHead = sbuHead;
	}
	public void getSbuHead() 
	{
		System.out.println("sbuHead: " +sbuHead);
	}
	
	public void setEmpList(List<Employee> empList) 
	{
		this.empList = empList;
	}
	public List<Employee> getEmpList() 
	{
		return empList;
	}
	
	String getSbuDetails() 
	{
		return " sbuHead: " +sbuHead +" SbuName: " +sbuName +"]" ;
	}

}
