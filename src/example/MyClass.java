package example;

public class MyClass implements MyInterface , Interface2 , MyInterface.Inner{

	@Override
	public void method1() {
		
		System.out.println(TEST);
		//TEST++;
		// cannot change because test is static and final
	}

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {


		
	}

	@Override
	public void method4() {
		
		
	}

	@Override
	public void hello() {
		
		
	}

	@Override
	public void hi() {
		
		
	}

	@Override
	public void common() {
		//inspite of having 2 common methods from immediate parents 
		//we can write only one common method definition because of overriding
		//this solves the diamond problem
		System.out.println("I am common");
	}

	@Override
	public void inner1() {
		// TODO Auto-generated method stub
		
	}

}
