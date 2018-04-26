package com.DI.Employees;

import org.springframework.stereotype.Service;

@Service("programmer")
public class Programmer implements Emp {

	@Override
	public void gotoOffice() {
		System.out.println("프로그래머2 출근");

	}

	@Override
	public void getoffWork() {
		System.out.println("프로그래머2 퇴근");

	}

}
