//클래스에 메서드만 있는경우(멤버 변수 없고 동작만 나타내는 코드)
class Calc{
	int add(int a, int b) { 
		return a+b;
	}
}
public class Calculation {

	public static void main(String[] args) {
		//객체 생성
		Calc calc = new Calc();
		//메서드 호출(객체 변수를 통해)
		int nReturn = calc.add(3, 9);
		
		System.out.println("3 + 9 = " +nReturn);
	}

}
