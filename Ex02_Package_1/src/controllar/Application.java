package controllar;

public class Application {

	public static void main(String[] args) {
		gmchan1.Circle c1 = new gmchan1.Circle();
		c1.setRad(3.5);
		System.out.println("반지름 3.5 원 넓이 : "+ c1.getArea());
		
		gmchan2.Circle c2 = new gmchan2.Circle();
		c2.setRad(3.5);
		System.out.println("반지름 3.5 원 둘레 : " + c2.getPerimeter());
	}

}
