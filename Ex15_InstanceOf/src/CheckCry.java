interface Cry{
	void cry(); //메서드 정의
}

class Cat implements Cry{
	@Override
	public void cry() {
		System.out.println("먀옹~");
	}
}

class Dog implements Cry{
	@Override
	public void cry() {
		System.out.println("왈왈!");
	}
}

public class CheckCry {
	
	public static void main(String[] args) {
		Cry test1 = new Cat(); // 서브클래스를 만들어서 슈퍼클래스에 대입하는 구조
//		Cry test1 = new Dog();
		
		if(test1 instanceof Cat) {
			test1.cry();
		}else {
			System.out.println("고양이가 아닙니다.");
		}
	}

}
