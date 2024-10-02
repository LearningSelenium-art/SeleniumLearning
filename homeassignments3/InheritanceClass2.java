package homeassignments3;

public class InheritanceClass2 extends InheritacneClass1{

	public void enterUsername1() {
		System.out.println("This is the username");
	}
	
 public void enterPassword1() {
	 System.out.println("Please enter the password");
	 
 }
 public static void main(String[] args) {
	 InheritanceClass2 ic1 = new InheritanceClass2();
	 ic1.enterCredentials();
	 ic1.enterPassword();
	 ic1.enterPassword1();
	 
	 ic1.enterUsername();
	 ic1.enterUsername1();
	 ic1.navigateToHomePage();
}
}
