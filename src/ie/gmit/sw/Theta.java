package ie.gmit.sw;

/**
 * Interface for Delta, Epsilon and Zeta.
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
	 * Calls the method delta() in Delta.java
	 * 
	 * @param String value operand one
	 */
	public int delta(String value);
	
	/**
	 * Calls the method deltaTest() in Delta.java
	 * 
	 */
	public String deltaTest();
	
	/**
	 * Calls the method epsilonTest() in Epsilon.java
	 * 
	 */
	public String epsilonTest();
	
	/**
	 * Calls the method epsilon() in Epsilon.java
	 * 
	 * @param String value operand one
	 */
	public int epsilon(String value);
	
	/**
	 * Calls the method zeta() in Zeta.java
	 * 
	 * @param String v operand one
	 */
	public int zeta(String v);
	
	/**
	 * Calls the method zetaTest() in Zeta.java
	 * 
	 */
	public String zetaTest();

}
