package ie.gmit.sw;

/**
 * Interface for Beta & Gamma.
 * 
 * Holds methods that are incorporated into Gamma and Beta.
 * 
 * @author Grace Keane
 * @ Version 15
 * 
 */

public interface Iota {
	
	// Generating delegate method
	
	/**
	 * Creating an object Iota with a parameter of Status s.
	 * 
	 * @param Status s operand one
	 *  
	 */
	public Object Iota(Status s);
	
	/**
	 * Calls the method gamma() in Gamma. 
	 *   
	 */
	public String gamma();
	
	/**
	 * Calls the method beta() in Beta. 
	 *  
	 */
	public String beta();
	
}


