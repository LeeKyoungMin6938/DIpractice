package onj.spel.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;
@Service("sample")
public class SpelInjectionExam {
	private String name;
	private String age;
	
	//Onj 객체의 getName을 호출해 값을 세팅
	@Value("#{onj.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Value("#{onj.age}")
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
