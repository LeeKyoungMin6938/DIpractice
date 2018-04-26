package ojc2;

public abstract class Emp {
public Emp() {}

//getEmp를 주입, Emp가 주입된다.
//Run-Time중에 xml 파이롤 부터 받은 빈을 주입받는다.
public abstract Emp getEmp();


public void work() {
	getEmp().work(); //주입받은 객체의 getEmp()메소드를 사용
}


}
