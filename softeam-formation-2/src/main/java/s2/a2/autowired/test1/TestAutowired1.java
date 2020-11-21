package s2.a2.autowired.test1;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import s2.a2.autowired.beans.AWB11;
import s2.a2.autowired.beans.AWBMissing;
import s2.a2.autowired.beans.B1;

@ComponentScan(basePackages = {"s2.a2.autowired.beans", "s2.a2.autowired.test1"})
public class TestAutowired1 {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestAutowired1.class);

		System.out.println(context.containsBean("t1"));
	}
}

//@Component
//class T1 {
//	
//	AWB11 x;
//	
//	public T1(AWB11 x) {
//		this.x = x;
//	}
//	
//}


//@Component
//class T1 {
//	
//	AWB11 awb11;
//	AWBMissing missing;
//	
//
//	public T1() {
//	}
//	
//	public T1(AWB11 awb11) {
//		this.awb11 = awb11;
//	}
//	
//	public T1(AWBMissing x) {
//		this.missing = x;
//	}
//	
//}

//@Component
//class T1 {
//	
//	AWB11 awb11;
//	AWBMissing missing;
//
//	@Autowired(required = false)
//	public T1(AWB11 awb11) {
//		this.awb11 = awb11;
//	}
//
//	@Autowired(required = false)
//	public T1(AWBMissing x) {
//		this.missing = x;
//	}
//	
//}

//@Component
//class T1 {
//	
//	@Autowired(required = true)
//	Set<AWBMissing> b1s;
//	
//	
//	
//	public T1(Map<String, B1> b1s, Set<AWBMissing> mbs) {
//		System.out.println("T1(Map<String, B1> b1s, Set<AWBMissing> mbs)");
//		System.out.println(b1s);
//		System.out.println(mbs);
//	}
//
//	
//	public T1() {
//		System.out.println("T1(Map<String, B1> b1s)");
//		System.out.println(b1s);
//	}
//	
//
//	
//}


@Component
class T1 {
	

	
	public T1(@Autowired(required = false) Map<String, B1> b1s, @Autowired(required = false) Set<AWBMissing> mbs) {
		System.out.println("T1(Map<String, B1> b1s, Set<AWBMissing> mbs)");
		System.out.println(b1s);
		System.out.println(mbs);
	}

	
	public T1(@Autowired(required = false)Map<String, B1> b1s) {
		System.out.println("T1(Map<String, B1> b1s)");
		System.out.println(b1s);
	}
	
}

