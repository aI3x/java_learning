// file: ClassLoaderExample.java

public class ClassLoaderExample {

	public static void main(String[] args) {

		// Print classloader's name of current class
		Class c = ClassLoaderExample.class;
		System.out.println(c.getClassLoader());

	}
}