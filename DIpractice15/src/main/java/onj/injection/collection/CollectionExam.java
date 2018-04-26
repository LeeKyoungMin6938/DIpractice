package onj.injection.collection;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionExam {
	private Map<String, Object> map;
	private Properties props;
	private Set<Object> set;
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Set<Object> getSet() {
		return set;
	}
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	
	public void display() {
		for(Map.Entry<String, Object> entry:map.entrySet()) {
			System.out.println("Key : "+entry.getKey() + "-" + entry.getValue());
		}
		
		for(Map.Entry<Object, Object> entry:props.entrySet()) {
			System.out.println("Key : "+entry.getKey() + "-" + entry.getValue());
		}
		
		for(Object obj: set) {
			System.out.println("value : " + obj);
		}
	}
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context5.xml");
		ctx.refresh();
		CollectionExam col = (CollectionExam)ctx.getBean("sample");
		col.display();

	}

}
