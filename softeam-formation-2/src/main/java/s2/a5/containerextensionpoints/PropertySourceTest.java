package s2.a5.containerextensionpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:a5/PropertySourceTest.properties")
@ComponentScan(basePackageClasses = PropertySourceTest.class)
//PropertySourcesPlaceholderConfigurer
public class PropertySourceTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PropertySourceTest.class);
		
		ctx.getBean(A.class).printI();
	}
	
}

@Component
class A {
	
	@Value("${property.i}")
	private int i;
	
	public A() {
	}
	
	public void printI() {
		System.out.println("i = " + i);
	}
	
}
