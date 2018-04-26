package com.DI.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("develope")
public class Develope {
	
	@Autowired
	@Qualifier("programmer")
	Emp emp;	
	
	public void coding() {
		emp.gotoOffice();
		System.out.println(". . . . . . 일 하 는 중");
		emp.getoffWork();
	}
}
