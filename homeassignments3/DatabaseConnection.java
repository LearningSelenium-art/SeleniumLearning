package homeassignments3;

public interface DatabaseConnection {
	
	public void  connect();
	
	public void disconnect();
	
	public void  executeUpdate();
	
	public void executeQuery();

}
