package gmchan2;

public class Circle {
	final double PI= 3.14;
	double rad;
	
	public void setRad(double r) {
		rad = r;
	}
	
	//원의 둘레를 반환하는 메서드
	public double getPerimeter() {
		return (rad * 2) * PI;
	}
}
