package step1;

// 스택을 확인하는 예제
public class StackUse {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		adder(num1, num2);
		System.out.println("--------------"); //스택영역 변화 확인하려고 기입.
	}
	
	public static int adder(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

}
