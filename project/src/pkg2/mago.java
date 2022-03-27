package pkg2;

  //multi level inheritance

public class mago extends chichi {
	
public void method1() {
		
		System.out.println("child method");
	}
 
     public static void main(String[] args) {
		
    	 mago obj=new mago();
    	 obj.method1();
    	 obj.method();
    	 obj.kore();
    	 obj.sore();
    	 obj.anata=222;
    	 System.out.println(obj.anata);
    	 

	}

}
