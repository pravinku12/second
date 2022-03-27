package pkg2;

    //single level inheritance

public class Watashi1 extends watashi
{
    public void are() {
    	
    	System.out.println("child class methode");
    }
    
    public static void main(String[] args) {
		
    	Watashi1 ob=new Watashi1();
    	ob.kore();
    	ob.sore();
    	ob.are();
    	ob.anata=143;
    	System.out.println(ob.anata);
	}
}
