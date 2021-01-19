// static의 이해

class Cat {
	static int a = 5;
	int num = 3;

	void Print(int num3) {
		System.out.println("a:"+a);
		num = num3;
		System.out.println("num:"+num);
	}
}

public class StaticEx1 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + ", " + num2); // num1 : 5, num2 : 2
		
		Cat cat1 = new Cat();	//참조변수 생성
		cat1.num = 1;
		cat1.a = 10;
		cat1.Print(20); // a는 10 num은20
		System.out.println(cat1.num); //1
		System.out.println(cat1.a); //10
		
		Cat cat2 = new Cat(); //참조변수 생성
		cat2.num = 2;
		cat2.a = 11;
		cat2.Print(20); //a는 11 num은 20
		System.out.println(cat2.num); //위에 num에 20을 대입했으므로 20
		System.out.println(cat2.a); //11
		System.out.println(cat1.a); //11
	}
}
