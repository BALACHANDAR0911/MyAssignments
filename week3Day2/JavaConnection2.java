package week3Day2;

public class JavaConnection2 extends MySqlConnection {

	@Override
	public void executeQuerry(String query) {
		System.out.println("Executing query on Mysql Database "+ query);
		// TODO Auto-generated method stub
	}
	public void connect() {
		System.out.println("Java Connecting...");
	}
	public void disconnect() {
		System.out.println("Java Disconnecting...");
	}
	public void executeUpdate(String query) {
		System.out.println("java : executing "+query);
	}
	
	public static void main(String args[]) {
		JavaConnection db = new JavaConnection();
		db.connect();
		db.executeQuery("Query executing...");
		db.disconnect();
	}

}
