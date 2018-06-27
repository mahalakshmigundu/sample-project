package test;

public class StaticCLass {

	public String str = null;
	public static String str1 = null;

	public void method() {
		System.out.println("Method");
		str = "123";
		str1 = "123";
	}

	StaticCLass() {
		System.out.println("Constructor");
	}

	public static void method1() {
		System.out.println("Method1");
//		str = "123";
		str1 = "123";
	}

}

//
class Test1 {

	public static void main() {
		
		StaticCLass t = new StaticCLass();
		t.method();
		
		StaticCLass.method1();
	}

}