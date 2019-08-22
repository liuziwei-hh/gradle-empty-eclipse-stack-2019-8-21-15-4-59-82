
public class Truck implements CarI {
    protected String payload;
	protected Truck(String engine,String wheels,String payload) {
//		super(engine, wheels);
		
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//       truckStart();
       load();
	}
//	public static void truckStart() {
//		System.out.println("tips, {engine} is on and {wheels} are running!");
//	}
	
	public static void load() {
		System.out.println("{payload} is loading goods");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("tips, {engine} is on and {wheels} are running!");
	}

}
