package week1Day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lb1 = new Library ();
		String bookName = "Risks Matters";
		String result=lb1.addBook(bookName);
		System.out.println(result+ " book added successfully");
		lb1.issueBook();
		
		// TODO Auto-generated method stub

	}

}
