package homeassignments;

public class Library {

	public void addBook(String bookTitle) {
		System.out.println("This is the bookTitle : " +bookTitle);
	}
	public void issueBook() {
		System.out.println("This is the book should be issued");
	}
	public static void main(String[] args) {
		Library lb=new Library();
		
		lb.addBook("How to Learn Selenium");
		lb.issueBook();
		
	}
}
