package homeassignments3;

public class BasePageOveriding {

	public void findElement() {
		System.out.println("this is the Element");
	}
	public void  clickElement() {
		System.out.println("Please clcik on this element");
	}
	public void  enterText() {
		System.out.println("Please enter the text");
	}
	public void  performCommonTasks() {
		System.out.println("This is the task to perform");
	}
	public static void main(String[] args) {
		BasePageOveriding bp = new BasePageOveriding();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
	}
	}

	
