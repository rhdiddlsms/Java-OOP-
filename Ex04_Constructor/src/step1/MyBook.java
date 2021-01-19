package step1;

class Book{
	String title; //책 제목
	int price; //책 가격
	int num; //주문수량
	
	Book(){
		title = "이금찬은 책을 낼 수 있을까?";
		price = 1000;
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}

	void print() {
		System.out.println("책 제목 : " + title);
		System.out.println("가격 : " + price);
		System.out.println("주문수량 : " + num);
		System.out.println("합계 금액 : " + price * num);
	}
}
public class MyBook {

	public static void main(String[] args) {
//		Book book = new Book();
		Book book = new Book("이금찬 책 저자 가능?", 15000);
		book.num = 5;
		book.print();
	}

}
