class Books{

String title;
String author;



}

public class BooksTestDrive{
public static void main(String[] args){
	 Books[] bookArray = new Books[3];
	int x = 0;
	
	bookArray[0] = new Books();
	bookArray[1] = new Books();
	bookArray[2] = new Books();
	
	bookArray[0].name = " Let us c ";
	bookArray[1].name = " Head First Java";
	bookArray[2].name = " Java for Beginners";
	bookArray[0].author = "bob";
	bookArray[1].author = "sue";
	bookArray[2].author = "ian";
	
	
	while(x<3){
		System.out.println(bookArray[x].name);
		System.out.println("by");
		System.out.println(bookArray[x].author);
		x = x+1;
		
		
	}
}


}