package s2.a2.qualifier;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackageClasses = TestQualifier1.class)
public class TestQualifier1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestQualifier1.class);

		System.out.println(((Fff) context.getBean("fff")).sss1.name);
	}

}

class Sss implements BeanNameAware{
	
	String name;
	public String name() {
		return this.name();
	}
	public void setBeanName(String name) {
		this.name = name;
	}
}

@Component
class Sss1 extends Sss{
	
}
@Component
class Sss2 extends Sss{
	
}

@Component
class Fff {
	@Autowired
	@Qualifier("sss2")
	Sss sss1;
	
	public Sss getSss() {
		return sss1;
	}
}