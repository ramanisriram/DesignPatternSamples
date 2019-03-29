package abstractfactory;

/*
 * Abstract Factory is factory of factories. Here i have combined to both abstract class and interface.
 * Actually an interface implements a method that returns the function of a class that extends and abstract class
*/
public class TestStub {
	public static void main(String args[]) {
		FacNewRecord aaa = new FacNewRecord();
		Module ma = createNewModuleRecord(aaa);
		System.out.println(ma.getModuleName());
		
		CollNewRecord bbb = new CollNewRecord();
		ma = createNewModuleRecord(bbb);
		System.out.println(ma.getModuleName());
	}

	public static Module createNewModuleRecord(NewRecord abs) {
		return abs.createNewModule();
	}
}