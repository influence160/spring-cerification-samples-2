package com.othmen.testspring.springcore.loadcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.GenericApplicationContext;

import com.othmen.testspring.springcore.loadcontext.beans.TestBean;
import com.othmen.testspring.springcore.loadcontext.beans.TestBean2;

@Configuration
@ImportResource()
public class JavaBasedContext2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaBasedContext2.class);
		context.refresh();
		System.out.println(context.getBeanNamesForType(TestBean.class)[0]);
		System.out.println(context.getBeanNamesForType(JavaBasedContext2.class)[0]);
		System.out.println(context.getBeanNamesForType(TestBean2.class)[0]);
	}
	
	@Bean()
	public  TestBean testBean() {
		return new TestBean();
	}
	
	@Bean
	public TestBean2 testBean2() {
		testBean();
		testBean();
		return new TestBean2(testBean());
	}

}
