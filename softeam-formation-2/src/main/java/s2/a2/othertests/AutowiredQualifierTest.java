package s2.a2.othertests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import s2.a2.othertests.qualifier.A;
import s2.a2.othertests.qualifier.A1;
import s2.a2.othertests.qualifier.A6;

@Configuration
@ComponentScan(basePackages = "s2.a2.othertests.qualifier")
public class AutowiredQualifierTest {

	public static void main(String[] args) {
		//Difference between @Autowired and @Resource
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AutowiredQualifierTest.class);
		System.out.println(ctx.getBean(s2.a2.othertests.qualifier.A3.class).getA());
		System.out.println(ctx.getBean(s2.a2.othertests.qualifier.A3.class).getA4());
		System.out.println(ctx.getBean(A6.class).getA());
		
	}
	
	@Bean
	@Qualifier()
	public A getA5() {
		return new A1();
	}
	
	@Bean
	public A6 a6(@Autowired @Qualifier("getA5") A a) {
		return new A6(a);
	}


}
