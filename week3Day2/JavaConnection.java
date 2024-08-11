package week3Day2;

public class JavaConnection implements DatabaseConnection {

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
	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdate();
		// TODO Auto-generated method stub

	}

	public void executeQuery(String str) {
		System.out.println("executing query");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdate(String s) {
		System.out.println("executing update");
		// TODO Auto-generated method stub
		
	}
}
