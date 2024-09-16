package week1.day2;

public class Browser {

	//method calling with one input arguments
	public void launchBrowser (String browserName) {
		System.out.println(browserName + " Browser launched successfully");
	}
	//method calling without input arguments
	public void loadUrl() {
		System.out.println("Application url loaded successfully");	
	}
	
	
	public static void main(String[] args) {
		 Browser bw = new  Browser();
		 bw.launchBrowser("Chrome");
		 bw.loadUrl();
		 
	}
}


