package s2.a5.containerextensionpoints.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Bfpp implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		beanFactory.getBeanDefinition("object").setBeanClassName("s2.a5.containerextensionpoints.beans.B2");
	}

}
