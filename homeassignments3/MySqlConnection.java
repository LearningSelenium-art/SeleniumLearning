package homeassignments3;

public class MySqlConnection implements DatabaseConnection{

	

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect to this link");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect the link");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("After after Executed");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Excute the query");
		
	}
		
	}
	


