package test;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a= new Animal();
		a.drink();
		a.eat();
		a.walk();
		
		System.out.println("=======================================");
		
		Cat c= new Cat();
		c.bark();
		c.drink();
		c.eat();
		c.walk();
		
		System.out.println("=======================================");
		Animal a1=new Cat();
		
		a1.drink();
		a1.eat();
		a1.walk();
		System.out.println("=======================================");
		
	}

}
