package javaPackage;

public class AbstractClass extends AnimalAbst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalAbst a= new AbstractClass();
        a.location(); 
        a.locationMessage();
	
	}
	public void location() {
        System.out.println("long and latitude .........");
        
    }
	public void locationMessage()
	{
		System.out.println("Location reached");
	}

}


abstract class AnimalAbst{
	 
	 abstract public void location();
	
	 void locationMessage()
	 {
		 System.out.println("Loaction");
	 }
   
   
}