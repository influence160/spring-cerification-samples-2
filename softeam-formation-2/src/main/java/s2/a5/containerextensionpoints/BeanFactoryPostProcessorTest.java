package s2.a5.containerextensionpoints;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import s2.a5.containerextensionpoints.beans.B2;
import s2.a5.containerextensionpoints.beans.BPP;

public class BeanFactoryPostProcessorTest {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("a5/BeanFactoryPostProcessorTest.xml");
		context.refresh();
		Object b2 = context.getBean("object");
		System.out.println(b2 instanceof B2);
		context.close();
	}

}
