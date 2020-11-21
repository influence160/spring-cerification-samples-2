package s2.a2.othertests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import s2.a2.othertests.beans1.A3;

public class AutowiredMultipleCondidateTest1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("s2.a2.othertests.beans1");
		System.out.println(ctx.getBean(A3.class).getA());
		
		//NoUniqueBeanDefinitionException
	}

}
