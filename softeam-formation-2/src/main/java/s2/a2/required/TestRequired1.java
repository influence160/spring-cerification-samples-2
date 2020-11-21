package s2.a2.required;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import s2.a2.required.b1.ExistingBean;
import s2.a2.required.b1.MissingBean;


@ComponentScan(basePackageClasses = TestRequired1.class)
public class TestRequired1 {
		
		public static void main(String[] args) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestRequired1.class);

			System.out.println(context.containsBean("existingBean"));
			System.out.println(context.containsBean("missingBean"));
		}
}

@Component
class T1 {
	
	public T1(ExistingBean eb, @Nullable MissingBean mb) {
		System.out.println("new T1");
		
	}
	
	@Inject
	public void setMissingBean(Provider<MissingBean> mb) {
		System.out.println("setMissingBean");
	}

	@Autowired(required = false)
	public void setMissingBean2(MissingBean mb) {
		System.out.println("setMissingBean2");
	}

	@Autowired
	public void setMissingBean3(Optional<MissingBean> mb) {
		System.out.println("setMissingBean3");
	}

	@Autowired
	public void setMissingBean4( MissingBean mb) {
		System.out.println("setMissingBean3");
	}
	
}
