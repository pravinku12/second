package pkg;

public class keyword {

	public void method1() {
		
		this.method4(1, 2,3);
		System.out.println("default method ");
	}
	
    public void method2(int a) {
    	
		this.method1();
		System.out.println("one parameterized method ");
	}
     
   public void method3(int a,int b) {
	   
	this.method5(1,2,3,4);
	  System.out.println("two parameterized method ");
   }
   
   public void method4(int a,int b,int c) {
		
		  System.out.println("three parameterized method ");
	   }
   
   public void method5(int a,int b,int c,int d) {
	   
		this.method2(1);
		  System.out.println("four parameterized method ");
	   }
   
   public static void main(String[] args) {
	
	   keyword obj=new keyword();
	   obj.method3(1,2);
}


	
}
