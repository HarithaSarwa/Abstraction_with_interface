package java8_features;

public class NewStyleLambda {

	public static void main(String[] args) {
		HelloFunctional h =()->{
			System.out.println("Hey Lambda");
		};
		h.hey();
		
		HelloFunctional h1 =()->{
			System.out.println("Hey Lambda again ");
		};
		h1.hey();
		
		Functional2 f=(String s)->{
			System.out.println("Hello " +s);
		};
		
		f.sayHi("Haritha");
		
		MultipleFunctional m = (x,y,z)->{
			return x*y*z;
		};
		System.out.println(m.multiply(3,5,4));
		
	}
	
}
