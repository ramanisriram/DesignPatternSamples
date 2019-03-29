package abstractfactory;

public class CollNewRecord implements NewRecord {

	@Override
	public Module createNewModule() {
		return new Collaterals();
	}
	
}