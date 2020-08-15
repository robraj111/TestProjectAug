package test;

public class TestB extends OverLoading {
	
	String name="tiv";
	
	public void tester() {
		System.out.println(super.name);
		System.out.println(name);
	}

	public void qa() {
		System.out.println("sub class QA");
		super.qa();
	}
}
