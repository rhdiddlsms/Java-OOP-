package step2;

//힙영역을 확인하는 예제
class Book {
	String title;
}

public class HeapUse {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "자바 클래스 기초";
		book2.title = "자바 디자인 패턴";
		
		System.out.println(book1.title);
		System.out.println(book2.title);
		
		book1 = null;
		book2 = null;
	}
}
