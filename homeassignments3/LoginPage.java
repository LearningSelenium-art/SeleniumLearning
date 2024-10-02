package homeassignments3;

public class LoginPage extends BasePageOveriding{

	public void  performCommonTasks() {
		System.out.println("Perform this task");
	}
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.performCommonTasks();
	}
}
