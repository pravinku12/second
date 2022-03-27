package pkg;

public class hello2 {
	
       public hello2() {
		System.out.println("Default constructor");
	}
       
       public hello2(int a) {
    	   this(1,2,3);
   		System.out.println("one parameterized constructor");
   	}
       
       public hello2(int a,int b) {
    	   this();
      		System.out.println("two parameterized constructor");
      	}
       
       public hello2(int a,int b,int c) {
    	   this(1,2);
      		System.out.println("three parameterized constructor");
      	}
       
       public static void main(String[] args) {
		
    	   hello2 a1=new hello2(1);
	}
}
