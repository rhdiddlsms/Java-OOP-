package step1;
//인터페이스는 상속 관계가 아닌 클래스에
//기능을 제공하는 구조.
//클래스와 비슷한 구조이지만,
//정의와 추상 메서드만이 멤버가 될 수 있다.
interface Greet{
	void greet();
}
interface Bye{
	void bye();
}

class Morning implements Greet, Bye{

	@Override
	public void bye() {
		System.out.println("으악..");
	}

	@Override
	public void greet() {
		System.out.println("ㅠㅠㅠㅠ");
	}
	
}
public class Meet {

	public static void main(String[] args) {
		
		Morning morning = new Morning();
		morning.bye();
		morning.greet();
	
	}

}
