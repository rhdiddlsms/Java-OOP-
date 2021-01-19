package team1;

import team2.AnotherClass2;

//접근제한자 실행 가능한지 테스트
public class Application {
	public int num1;
	private int num2;
	protected int num3;
	int num4;

	public void test1() {System.out.println("test1");}
	private void test2() {System.out.println("test2");}
	protected void test3() {System.out.println("test3");}
	void test4() {System.out.println("test4");}
	
	public static void main(String[] args) {
		Application ap = new Application();
		ap.num1 = 1;
		ap.num2 = 2;
		ap.num3 = 3;
		ap.num4 = 4;
		System.out.println(ap.num1 +":"+ ap.num2+":"+ ap.num3 +":"+ ap.num4);
		
		AnotherClass1 ac1 = new AnotherClass1();
		ac1.num1 = 1; //public이여서 사용가능
//		ac1.num2 = 2; //private여서 같은 패키지여도 접근 불가능.
		ac1.num3 = 3; //다른 클래스내 접근 가능
		ac1.num4 = 4; //프로텍트랑 동일.
		
		AnotherClass2 ac2 = new AnotherClass2();
		ac2.num1 = 1;
//		ac2.num2 = 2;	//같은패키지가 아니여서 접근 불가
//		ac2.num3 = 3;	//다른패키지여서 접근 불가
//		ac2.num4 = 4;	// 프로텍트랑 동일
	
	}

}
