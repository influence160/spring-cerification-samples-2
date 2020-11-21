package s2.a4.factorymethod.testbeans;

public class A2 {
	
	private A1 a1;
	
	public A2(A1 a1) {
		System.out.println("new A2();");
		this.a1 = a1;
	}

}
