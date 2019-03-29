package singleton;

public class SingletonPattern {
	
	private final static SingletonPattern abc = new SingletonPattern();
	
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getInstance() {
		return abc;
	}
	
	
}