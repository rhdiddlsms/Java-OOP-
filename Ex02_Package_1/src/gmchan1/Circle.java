package gmchan1;

public class Circle {
	
	final double PI = 3.14; //final은 상수화
	double rad;
	
	public void setRad(double r) {
		rad = r;
	}

	//원의 넓이를 반환하는 메서드
	public double getArea() {
		return (rad*rad)*PI;
	}

}
