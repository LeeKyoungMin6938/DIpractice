package com.DI.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("develope")
public class Develope {	
	Emp emp;	
	
	@Autowired
	public Develope(@Qualifier(value="programmer")Emp emp) {
		this.emp = emp;
	}
	
	public void coding() {
		emp.gotoOffice();
		System.out.println(". . . . . . 일 하 는 중");
		emp.getoffWork();
	}
}
