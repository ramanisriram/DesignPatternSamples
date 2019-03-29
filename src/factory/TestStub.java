package factory;

/*
 * Factory Patter is something in which we need to return one class based
 * on multiple sub classes based on the input provided
*/
public class TestStub {
	public static void main(String args[]) {
		Module ab = new Facility();
		System.out.println(ab.getModuleName());
		
		Module ab1 = new Collaterals();
		System.out.println(ab1.getModuleName());
	}
}