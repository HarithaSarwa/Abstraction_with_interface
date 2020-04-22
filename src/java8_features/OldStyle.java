package java8_features;

public class OldStyle implements HelloFunctional{

	@Override
	public void hey() {
		System.out.println("heyyy");
		
	}

	public static void main(String[] args) {
		HelloFunctional h = new OldStyle();
		//LHS is interface and RHS is implementation class
		h.hey();
		
	}
}
