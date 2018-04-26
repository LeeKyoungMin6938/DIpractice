package ojc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodReplaceTest {

	Emp programmer;
	
	public void setProgrammer(Programmer programmer) {
		this.programmer = programmer;
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lookup.xml");
		MethodReplaceTest test = (MethodReplaceTest)ctx.getBean("methodReplaceTest");
		System.out.println(test.programmer.work());
	}

}
