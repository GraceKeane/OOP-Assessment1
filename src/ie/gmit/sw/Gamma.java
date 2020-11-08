package ie.gmit.sw;

/**
 * Class Gamma implements the interface Iota.
 * 
 * @author Grace Keane
 * @version 15
 * 
 */

public class Gamma implements Iota {
	
	/**
	 * When method gamma() is called it prints a simple statement and its class address.
	 * 
	 * @return returns null
	 *  
	 */
	public String gamma() {
		//return "Executing " + this.getClass().getName();
		System.out.println("Gamma.java is executing! " + "Class dddress: " + this.getClass().getName());
		return null;
	}

	/**
	 * Overriding the interface method Iota and retruning the method gamma.
	 * 
	 * @param Status s operand one takes in status of enum "Medium"
	 * @return returns the method gamma() above
	 * @return returns the value of s
	 *  
	 */
	@Override
	public Object Iota(Status s) {
		if (s == Status.Medium) {
			return gamma();
		}
		return s;
	}

	/**
	 * Overriding the Iota interface method beta().
	 * 
	 * @return return statement is null
	 *  
	 */
	@Override
	public String beta() {
		// TODO Auto-generated method stub
		return null;
	}

}
