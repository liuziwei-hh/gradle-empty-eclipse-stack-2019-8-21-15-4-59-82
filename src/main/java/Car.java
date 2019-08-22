
public class Car {
	protected String engine;
	protected String wheels;
	
	protected Car(String engine,String wheels) {
		this.engine = engine;
	}

	public static void main(String [] args) {
		start();
	}
	public static void start() {
		System.out.println("{engine} is on and {wheels} are running!");
	}

}
