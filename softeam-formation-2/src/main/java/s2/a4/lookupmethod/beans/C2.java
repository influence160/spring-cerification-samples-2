package s2.a4.lookupmethod.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class C2 {
	
	public void m1() {
		C1 c1 = m2();
		System.out.println(c1);
		System.out.println("end m1");
	}

	//Can also bean abstract and abstract class
	//ca se fait aussi en xml :     <bean id="c2" class="com.othmen.testspring.springcore.dependencies.beans.C2">  
	//	<lookup-method name="m2" bean="c1"/>
    //</bean>
	//par contre c'est pas possible avec @Bean
	@Lookup
	public C1 m2() {
		System.out.println("m2() call");
		return null;
	}
	
	public void setCcc() {
		
	}

}
