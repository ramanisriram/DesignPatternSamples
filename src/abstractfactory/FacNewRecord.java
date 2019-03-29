package abstractfactory;

public class FacNewRecord implements NewRecord {

	@Override
	public Module createNewModule() {
		return new Facility();
	}
	
}