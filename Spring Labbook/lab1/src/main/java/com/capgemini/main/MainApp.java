package com.capgemini.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.main.Employee;

public class MainApp 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.show();
		((ClassPathXmlApplicationContext)context).close();
	}

}
