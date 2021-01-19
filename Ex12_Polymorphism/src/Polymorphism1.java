//다형성
abstract class Calc {
	int a = 5;
	int b = 6;
	abstract void plus();
}

class MyCalc extends Calc{
	@Override
	void plus() { //추상메서드 오버라이딩
		System.out.println(a + b);
	}

	void minus() {
		System.out.println(a - b);
	}
	
}
public class Polymorphism1 {
	public static void main(String[] args) {
		MyCalc myCalc1 = new MyCalc();
		myCalc1.plus();
		myCalc1.minus();
		// 하위클래스 객체를 상위 클래스 객체에 대입
		Calc myCalc2 = new MyCalc();
		myCalc2.plus();
		// 다음 메서드는 설계도에 없다. 사용할 수 없다. (서브클래스에 만들어져 있지만 Calc로 만들어진 객체는 plus메서드만 받을 수 있음.)
//		myCalc2.minus();
	}
}
