package test;

public class test {

	public String name="raj";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(4,2,5,6);
	test t= new test();
	t.student();
     TestB test=new TestB();
     test.tester();
     test.qa();
	
	
	}
	
	public void student() {
		System.out.println("Sub class");
	}
	public static int add (int x, int y) {
		
		int c= x+y;
		return c;
	}
	
	public static int add (int x, int y, int z) {
		
		int c= x+y+z;
		return c;
	}
	
	public static void add(int x, int y,int z, int a) {
		
		System.out.println(x+y+z+a);
		
	}
	
	

}
