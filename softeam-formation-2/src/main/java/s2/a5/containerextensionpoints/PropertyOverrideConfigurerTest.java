package s2.a5.containerextensionpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = PropertySourceTest.class)
public class PropertyOverrideConfigurerTest {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyOverrideConfigurerTest.class);
		
		ctx.getBean(B.class).printI();
	}
	
	@Bean 
	public static PropertyOverrideConfigurer propertyOverrideConfigurer(
			@Value("classpath:a5/PropertyOverrideConfigurerTest.properties") Resource location) {
		PropertyOverrideConfigurer poc = new PropertyOverrideConfigurer();
		poc.setLocations(location);
		return poc;
	}

}

@Component
class B {

	private int i;
	
	public B() {
	}
	
	public void printI() {
		System.out.println("i = " + i);
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
}
