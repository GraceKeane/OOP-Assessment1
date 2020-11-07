package ie.gmit.sw;

/**
 * Class Beta implements the interface Iota.
 * 
 * @author Grace Keane
 * @version 15
 * 
 */

public class Beta implements Iota {
	
	/**
	 * When method beta() is called it prints a simple statement and
	 * its class address.
	 * 
	 * @return returns null
	 *  
	 */
	public String beta() {
		System.out.println("Beta.java is executing! " + "Class dddress: " + this.getClass().getName());
		return null;
	}

	/**
	 * Overriding the interface method Iota.
	 * 
	 * @param Status s takes in status of enum "Slight" or "Low"
	 * @return returns the method beta() above
	 * @return returns the value of s
	 *  
	 */
	@Override
	public Object Iota(Status s) {
		if (s == Status.Slight || s == Status.Low) {
			return beta();
		}
		return s;
	}

	/**
	 * Overriding the Iota interface method gamma().
	 * 
	 * @return return statement is null
	 *  
	 */
	@Override
	public String gamma() {
		// TODO Auto-generated method stub
		return null;
	}
}
