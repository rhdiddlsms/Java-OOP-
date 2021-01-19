abstract class Animal{
	int age;
	abstract void cry();
}

class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("따오오오~");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("먀옹~");
	}
}
public class AbstractClassEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.cry();
		Cat cat = new Cat();
		cat.cry();
	}

}
