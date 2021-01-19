package step2;

class Book{
	String title; //책 제목
	int price; //책 가격

	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	// 복제 생성자
	Book(Book copy){
		title = copy.title;
		price = copy.price;
	}
	
	void print() {
		System.out.println("제목 : "+ title);
		System.out.println("가격 : "+ price);
	}

}
public class MyBook {

	public static void main(String[] args) {
//		Book book1 = new Book(); // 이렇게 생성하면 에러가 생김
		Book book1 = new Book("이금찬 사람되기", 15000);
		book1.print();
		//복제 생성자 사용
		Book book2 = new Book(book1);
		book1.title = "이금찬 디자인";
		book1.print();
	}

}
