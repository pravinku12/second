package pkg2;

 //hierarchical inheritance
public class musuko extends Chichi1 {
	
	public void method4() {
		
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		
		musuko s=new musuko();
		s.method4();
		s.method2();
	}

}
