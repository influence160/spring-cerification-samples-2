package s2.a5.containerextensionpoints.beans;

public class B1 {
	
	public void init() {
		System.out.println("init B1");
	}
	
	public B1() {
		System.out.println("new B1();");
	}
	
	private void destroy() {
		System.out.println("destroy B1");
	}

}
