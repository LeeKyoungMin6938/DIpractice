package onj.spel.injection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpelInjectionExam {
	private String name;
	private String age;
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Your name is [name=" + name + ", age=" + age + "]";
	}
	
	
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context2.xml");
		ctx.refresh();
		
		SpelInjectionExam sample = (SpelInjectionExam)ctx.getBean("sample");
		System.out.println(sample);
	}

}
