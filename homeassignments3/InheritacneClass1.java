package homeassignments3;

public class InheritacneClass1 extends InheritanceTestData{

	public void enterUsername() {
		System.out.println("This is the username");
	}
	
 public void enterPassword() {
	 System.out.println("Please enter the password");
	 
 }
 public static void main(String[] args) {
	 InheritacneClass1 ic = new InheritacneClass1();
	 ic.enterCredentials();
	 ic.enterPassword();
	 ic.enterUsername();
	 ic.navigateToHomePage();
}
}
