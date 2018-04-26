package com.DI.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DI.Employees.Develope;

public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		
		Develope dev = (Develope)ctx.getBean("developer");
		dev.coding();

	}

	

}
