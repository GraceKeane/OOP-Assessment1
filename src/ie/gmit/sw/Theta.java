package ie.gmit.sw;

/**
 * Interface for Delta, Epsilon and Zeta.
 * 
 * Holds methods that are incorporated into classes specified.
 * 
 * @author Grace Keane
 * @ Version 15
 * 
 */
public interface Theta {
		
	// Generating delegate method
	
	/**
	 * Creating an object Theta. Method has no param.
	 */
	public Object Theta();
	
	/**
	 * Calls the method delta() in Delta. 
	 * 
	 * @param String value operand one
	 */
	public int delta(String value);
	
	/**
	 * Calls the method deltaTest() in Delta. 
	 * 
	 */
	public String deltaTest();
	
	/**
	 * Calls the method epsilonTest() in Epsilon. 
	 * 
	 */
	public String epsilonTest();
	
	/**
	 * Calls the method epsilon() in Epsilon. 
	 * 
	 * @param String value operand one
	 */
	public int epsilon(String value);
	
	/**
	 * Calls the method zeta() in Zeta. 
	 * 
	 * @param String v operand one
	 */
	public int zeta(String v);
	
	/**
	 * Calls the method zetaTest() in Zeta. 
	 * 
	 */
	public String zetaTest();

}
