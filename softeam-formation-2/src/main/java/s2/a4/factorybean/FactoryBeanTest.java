package s2.a4.factorybean;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class FactoryBeanTest {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("a4/FactoryBeanTest.xml");
		context.refresh();
		context.getBean("c21");
		context.getBean("c22");
		System.out.println("context.getBean(c1) = " + context.getBean("c1"));
		System.out.println("context.getBean(c2) = " + context.getBean("c2"));
		context.close();
	}

}
