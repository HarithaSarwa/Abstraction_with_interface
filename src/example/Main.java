package example;

public class Main {

	public static void main(String[] args) {
		MyInterface m = new MyClass();
		//left hand side is interface
		//right hand side is its implementation class
		m.common();
		m.method1();
		Interface2 i= new MyClass();
		i.common();
		i.hello();
		MyInterface.Inner i2 = new MyClass();
		i2.inner1();

	}

}
