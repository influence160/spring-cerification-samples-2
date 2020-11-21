package s2.a5.containerextensionpoints;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import s2.a5.containerextensionpoints.beans.BPP;

public class BeanPostProcessorTest {

	public static void main(String[] args) {		
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("a5/BeanPostProcessorTest.xml");
		context.refresh();
		BPP bpp = context.getBean("bpp", BPP.class);

		context.close();
	}

}
