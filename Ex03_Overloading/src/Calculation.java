// 오버로딩 : 클래스에 같은 이름의 메서드가 여러 개 존재하는것.
class Calc {
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a) {
		return a + 1;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}

public class Calculation {

	public static void main(String[] args) {
		//객체 생성
		Calc calc = new Calc();
		//메서드 호출
		int nReturn1 = calc.add(3, 9);
		int nReturn2 = calc.add(5);
		double nReturn3 = calc.add(3.6, 9.5);
		
		System.out.println(nReturn1+":"+ nReturn2+":" + nReturn3);
		
	}

}
