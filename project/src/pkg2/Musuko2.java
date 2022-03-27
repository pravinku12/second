package pkg2;

    // hierarchical inheritance
public class Musuko2 extends Chichi1{
	
public void method5() {
		
		System.out.println("child2 method");
	}
   
    public static void main(String[] args) {
		 
    	Musuko2 n=new Musuko2();
    	n.method5();
    	n.method2();
	}

}
