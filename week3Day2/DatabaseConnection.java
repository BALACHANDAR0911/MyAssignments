package week3Day2;

public interface DatabaseConnection {
	
	public void connect();
	public void disconnect();
	public void executeUpdate(String s);
	void executeUpdate();

}
