package s2.a2.othertests.beans1;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class A1 implements A, BeanNameAware{

	public void setBeanName(String name) {
		System.out.println("A1 bean name is : " + name);
		
	}

}
