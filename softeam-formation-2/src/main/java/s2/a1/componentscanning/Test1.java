package s2.a1.componentscanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@Configuration
@ComponentScan
public class Test1 {

		public static void main(String[] args) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test1.class);
//			context.scan("s2.test1");
			System.out.println(context.containsBean("b1"));
		}
		
}
