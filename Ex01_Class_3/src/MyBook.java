// 클레스에 필드만 있는 경우
class Book{
	String title;
	String author;
	int price;
}

public class MyBook {

	public static void main(String[] args) {
		//객체 생성
		Book book = new Book();
		//필드 접근
		book.title = "클래스의 기초";
		book.author = "이금찬";
		book.price = 32500;
		
		System.out.println(book.title + ":" +book.author + ":" + book.price);
	}

}
