package com.othmen.testspring.springcore.beanoverview;

import java.util.Arrays;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class TestBeanNaming2 {

	public static void main(String[] args) {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("beanoverview/BeansNamingTest2.xml");
		context.refresh();
		System.out.println(Arrays.toString(context.getBeanNamesForType(com.othmen.testspring.springcore.beanoverview.testbeans.A1.class)));
		
	}

}
