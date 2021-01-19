import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//소스가 없는 Class파일을 외부에서 받았을 때 
public class ClassForNameTest {
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class strClass = Class.forName("MyBook");
		
		//getConstructors 메소드를 통해서 출력
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons){
			System.out.println(c);
		}
		System.out.println("---------------------------");
		Field[] fields = strClass.getFields();
		for(Field f : fields){
			System.out.println(f);
		}
		System.out.println("----------------------------");
		Method[] methods = strClass.getMethods();
		for(Method m : methods){
			System.out.println(m);
		}
	}
}
