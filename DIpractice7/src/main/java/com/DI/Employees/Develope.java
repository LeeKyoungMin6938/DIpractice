package com.DI.Employees;

public class Develope {
	Emp emp;

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public void coding() {
		emp.gotoOffice();
		System.out.println("일 하 는 중 . . . . .");
		emp.getoffWork();
	}
}
