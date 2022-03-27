package pkg2;

public class parent{

	public parent() {
     
		System.out.println(" Parent Default constructor ");

	}
	
	public parent(int a) {
		
	     this(1,2,3);
		System.out.println(" Parent one parameterized constructor ");

	}
	
	public parent(int a,int b) {
		this();
		System.out.println(" Parent two parameterized constructor ");

	}
	
	public parent(int a,int b,int c) {
		
		this(1,2);
		System.out.println(" Parent three parameterized constructor ");

	}
}
