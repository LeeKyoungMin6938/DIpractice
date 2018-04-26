package ojc1;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Designer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		return "디자이너 업무중.";
	}

}
