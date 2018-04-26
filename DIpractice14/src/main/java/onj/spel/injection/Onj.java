package onj.spel.injection;

import org.springframework.stereotype.Service;

@Service("onj")
public class Onj {
	private String name="Onj";
	private String age="10";
	
	//app-context2.xml에서 SpelInjectionExam에 값을 주입하기 위해 getter만 만듬
	//#{onj.name} 구문에 이ㅡ해 getter가 호출되고 그 값이 SpelInjectionExam에 주입됨.
	
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	
	
	
	
	
	
}
