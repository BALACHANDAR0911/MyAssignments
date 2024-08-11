package week3Day2;

public abstract class MySqlConnection implements DatabaseConnection{
	@Override
	public void connect() {
		System.out.println("Connected...");
		// TODO Auto-generated method stub	
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected...");
		// TODO Auto-generated method stub
	}

	@Override
	public void executeUpdate() {
		System.out.println("updating...");
		// TODO Auto-generated method stub
	}
	public abstract void executeQuerry(String query);

}
