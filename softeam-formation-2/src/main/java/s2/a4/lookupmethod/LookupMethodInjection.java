package s2.a4.lookupmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import s2.a4.lookupmethod.beans.C2;

@Configuration
@ComponentScan(basePackageClasses = LookupMethodInjection.class)
public class LookupMethodInjection {
	//lookup method is used to inject a prototype bean to a singleton bean
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LookupMethodInjection.class);
//		new XmlBeanDefinitionReader(context).loadBeanDefinitions("a4/lookupMethodTest.xml");
//		context.refresh();
		C2 c2 = context.getBean(C2.class);
		c2.m1();
		System.out.println("-----");
		c2.m1();
	}
	

}
