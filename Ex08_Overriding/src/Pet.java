class Animal {
	String name;
	int age;
	
	void printPet() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Dog extends Animal{
	String variety;
	
	//부모와 같은 메서드명을 사용함.
	void printPet() {
		//super을 사용안하고 프린트펫을 부르면 자기자신을 가져오지만
		//super.을 사용하면 부모의 메서드를 가져옴
		super.printPet();// 여기부분을 주석처리하면 종류만 나오는 Dog클래스만 호출
		System.out.println("종류 : " + variety);
	}
}
public class Pet {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "따오";
		dog.age = 2;
		dog.variety = "말티즈";
		dog.printPet(); //기능의 추가를 확인할 수 있음.
	}

}
