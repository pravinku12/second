package pkg2;

public class bye extends hello {
	
public void method() {
		
		System.out.println("child default method");
	}
	
 public void method1(int a) {
		
		System.out.println("child one parameterized method");
	}
	
 public void method2(int a,int b) {
	 
	    this.meth3(1,2,3);
	    this.meth();
	    this.meth1(1);
	    super.meth2(1, 2); 
		this.method();
		this.method3(1,2,3);
		this.method1(1);
		System.out.println("child two parameterized method");
	}
 
 public void method3(int a,int b,int c) {
		
		System.out.println("child three parameterized method");
	}
     
    public static void main(String[] args) {
		
    	bye obj=new bye();
    	obj.method2(1,2);
	}

}
