package week1.day1;
/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console */
		
public class Mobile {
	public void makeCall()
	{
		String mobileModel = "Motorola";
		float mobileWeight = 50.43f;
		System.out.println("Mobile model is  "+mobileModel);
		System.out.println("Mobile weight is "+mobileWeight+"gm" );
		
	}
	public void sendMsg()
	{
		boolean isFullCharged = true;
		int mobileCost = 25000;
		System.out.println("Fully charged " +isFullCharged);
		System.out.println("Mobile cost is "+mobileCost);
	}

	public static void main(String[] args) 
	{
		Mobile motorola = new Mobile();
		motorola.makeCall();
		motorola.sendMsg();
		System.out.println("This is my Mobile details");

	}

}
