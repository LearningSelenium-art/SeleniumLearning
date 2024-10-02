package homeassignments3;

public class JavaConnection implements DatabseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Please connect with the link");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Link is disconnected");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute the update");
	}

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		}
}
