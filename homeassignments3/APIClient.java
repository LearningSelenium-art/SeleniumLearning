package homeassignments3;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("This is the :" +endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println(endpoint+ " "+requestBody+ " "+requestStatus);
	}
	public static void main(String[] args) {
		APIClient ac = new APIClient();
		ac.sendRequest("www.google.com");
		ac.sendRequest("www.facebook.com", "HelloWorld", true);
	}
}
