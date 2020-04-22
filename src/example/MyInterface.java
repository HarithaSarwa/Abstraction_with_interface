package example;

public interface MyInterface {

	
	//we don't need to use public and abstract keywords
	// By default the method is public and abstract.
	int TEST=1000;
	void method1();
	void method2();
	void method3();
	void method4();
	public void common();
	//No definition in parent here
	//Child gives the definition
	
	public interface Inner{
		
		void inner1();
	}
	
}
