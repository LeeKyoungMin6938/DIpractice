package com.DI.Employees;

public class Designer implements Emp {
	
	@Override
	public void gotoOffice() {
		System.out.println("디자이너 출근");

	}

	@Override
	public void getoffWork() {
		System.out.println("디자이너 퇴근");

	}
}
