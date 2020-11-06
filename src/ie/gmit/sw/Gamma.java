package ie.gmit.sw;

/**
 * Class Gamma implements the interface Iota.
 * 
 * @author Grace Keane
 * @ Version 15
 * 
 */

public class Gamma implements Iota {
		
	public String gamma() {
		
		//return "Executing " + this.getClass().getName();
		System.out.println("Gamma.java is executing! " + "Class dddress: " + this.getClass().getName());
		return null;
	}

	/**
	 * Overriding the interface method Iota.
	 * 
	 * @param s
	 *  
	 */
	@Override
	public Object Iota(Status s) {
		if (s == Status.Medium) {
			return gamma();
		}
		return s;
	}

	@Override
	public String beta() {
		// TODO Auto-generated method stub
		return null;
	}

}
