package s2.a2.othertests.qualifier;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("a2")
public class A2 implements A {

	
}
