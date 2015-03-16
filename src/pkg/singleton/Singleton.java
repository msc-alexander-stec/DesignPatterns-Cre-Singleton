package pkg.singleton;

public class Singleton {

	private static Singleton firstInstance = null;
	
	//
	// Constructor
	//
	
	private Singleton() {
		
	}
	
	//
	//
	//
	
	public static Singleton getInstance() {
		
		if (firstInstance == null) {
			firstInstance = new Singleton();
		}
		
		return firstInstance;
		
	}
	
}
