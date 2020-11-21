package s2.a2.othertests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class AutowiredMultipleCondidateTest4 {

	public static void main(String[] args) {
		//Difference between @Autowired and @Resource
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("s2.a2.othertests.beans4");
		ctx.refresh();
		System.out.println(ctx.getBean(s2.a2.othertests.beans4.A3.class).getA());
		
		System.out.println(ctx.getBean(s2.a2.othertests.beans4.A3.class).getA4());
		
	}


}
