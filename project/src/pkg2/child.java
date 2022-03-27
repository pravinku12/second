package pkg2;

public class child extends parent {

	public child() {
		
	    this(1,2);
		System.out.println(" child Default constructor ");

	}
	
	public child(int a) {
		
		this(1,2,3);
		System.out.println(" child one parameterized constructor ");

	}
	
	public child(int a,int b) {
		
	     this(1);
		System.out.println(" child two parameterized constructor ");

	}
	
	public child(int a,int b,int c) {
		
	     super(1);
		System.out.println(" child three parameterized constructor ");

	}
	
	public static void main(String[] args) {
		child ob=new child();
	}
}
