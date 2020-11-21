package s2.a5.containerextensionpoints;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class InstantiationTracingBeanPostProcessorTest  {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("a5/InstantiationTracingBeanPostProcessorTest.xml");
		context.refresh();
	}

}
