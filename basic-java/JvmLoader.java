import java.lang.reflect.Field;
import java.lang.reflect.Method;
class Test {
	int a;
	int b;
	public void setName(String name) {
	}


}
class JvmLoader {
	public static void main(String args[]) {
		Test test = new Test();
		Class cl= test.getClass();
		System.out.println(cl.getName());

		Field f[] = cl.getDeclaredFields();
		for (Field field : f) {
			System.out.println(field.getName());
		}

	 	Method m[] = cl.getDeclaredMethods();
        for (Method method : m)
            System.out.println(method.getName());
	}
}