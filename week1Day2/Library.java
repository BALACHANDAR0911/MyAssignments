package week1Day2;

public class Library {
	public String addBook(String bookTitle){
		String s1=bookTitle;
		return s1;

}
	 public void issueBook() {
		 System.out.println("Book issued successfully");
		 
	 }

	public static void main(String[] args) {
		Library lb = new Library();
		String bookDetails="Hitler";
		String result=lb.addBook("Hitler");
				System.out.println(result+" book added successfully");
lb.issueBook();
	}
	}

