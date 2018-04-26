package ojc2;

public class Programmer extends Emp{
	
	//Programmer 가 주입된다.
	@Override
	public Emp getEmp() {
		return this;
	}
	
	public void work() {
		System.out.println("프로그래머 업무중.");
	}
}
