package java8_features;

public interface NewInterface {

	public static void hey() {
	// from java 8 we can have static method from definition which can be defined
	//
		System.out.println("Hey I am static method from Interface available from java8");
	}
	default void helloDefault() {
		System.out.println("Hi default from Java8");
		//explicitly should use default keyword
	}
}
