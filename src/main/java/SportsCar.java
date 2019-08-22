
public class SportsCar extends Car{
	
    protected String lights;
    
	protected SportsCar(String engine, String wheels, String lights) {
	super(engine, wheels);
	this.lights = lights;
}
    public static void main(String[] args) {
    	speedOn();
    	sportsCarStart();
    }
    public static void sportsCarStart () {
    	System.out.println("{lights} are shining, {engine} is on and {wheels} are running!");
    }
	public static void speedOn() {
    	System.out.println("{engine} is overload and {wheels} are super running!");
    }
}
