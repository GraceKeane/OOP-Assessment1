package ie.gmit.sw;

/**
 * Class Zeta implements the interface Theta.
 * 
 * @author Grace Keane
 * @version 15
 * 
 */
public class Zeta implements Theta {
	
	/**
	 * Method zeta takes in a value v and returnes the
	 * parsed value of v plus 7.
	 * 
	 * @param String v operand one
	 * @return returns the parsed int of v plus 7
	 *  
	 */
	public int zeta(String v) {
		return Integer.parseInt(v) + 7;
	}
	
	/**
	 * When method zetaTest() is called it prints a simple statement along
	 * with its class address and hash code. This test clarifies that Zeta.java
	 * can be accessed in Alpha by calling the interface methods in Theta.
	 * 
	 * @return returns null
	 *  
	 */
	public String zetaTest() {
		System.out.println("Zeta.java is executing! " + "Class dddress: " + this.getClass().getName() + " Hash Code: " + hashCode());
		return null;
	}

	/**
	 * Overriding object Theta specified in the interface class
	 * 
	 * @return returns null
	 *  
	 */
	@Override
	public Object Theta() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Overriding the delta method specified in the Theta interface class
	 * 
	 * @return returns 0
	 *  
	 */
	@Override
	public int delta(String value) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Overriding the deltaTest specified in the interface class
	 * 
	 * @return returns null
	 *  
	 */
	@Override
	public String deltaTest() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Overriding the epsilonTest specified in the interface class
	 * 
	 * @return returns null
	 *  
	 */
	@Override
	public String epsilonTest() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Overriding the epsilon method specified in the interface class
	 * 
	 * @param String value operand one
	 * @return returns 0
	 *  
	 */
	@Override
	public int epsilon(String value) {
		// TODO Auto-generated method stub
		return 0;
	}
}