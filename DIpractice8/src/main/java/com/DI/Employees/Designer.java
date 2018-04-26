package com.DI.Employees;

import org.springframework.stereotype.Service;

@Service("designer")
public class Designer implements Emp {
	
	@Override
	public void gotoOffice() {
		System.out.println("디자이너2 출근");

	}

	@Override
	public void getoffWork() {
		System.out.println("디자이너2 퇴근");

	}
}
