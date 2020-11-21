package s2.a2.othertests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredMultipleCondidateTest3 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("s2.a2.othertests.beans3");
		ctx.refresh();
		System.out.println(ctx.getBean(s2.a2.othertests.beans3.A3.class).getA());
		
		System.out.println(ctx.getBean(s2.a2.othertests.beans3.A3.class).getA4());
		//Working
	}

}
