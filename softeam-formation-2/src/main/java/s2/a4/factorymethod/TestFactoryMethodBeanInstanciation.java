package s2.a4.factorymethod;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class TestFactoryMethodBeanInstanciation {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("a4/FactoryMethodTest.xml");
		context.refresh();
		System.out.println(context.getBean("a1"));
		System.out.println(context.getBean("b1"));
		System.out.println(context.getBean("a12"));
		System.out.println(context.getBean("a2"));
		
	}

}
