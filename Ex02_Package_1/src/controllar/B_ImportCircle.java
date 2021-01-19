package controllar;
import gmchan1.Circle;

//임포트를 하여 간단하게 입력하는 방법.
//하지만 이 방법은 패키지가 다른 같은클레스 이름이면 사용 불가능.
//하나의 클레스를 임포트 하여서 객체생성 할 때 변수명을 줄인다.
public class B_ImportCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRad(3.5);
		System.out.println("반지름 3.5 원 넓이 : "+ c1.getArea());
		
		Circle c2 = new Circle();
		c2.setRad(5.5);
		System.out.println("반지름 3.5 원 둘레 : " + c2.getArea());
	}
}
