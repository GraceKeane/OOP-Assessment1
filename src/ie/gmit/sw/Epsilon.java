package ie.gmit.sw;

/**
 * Class Epsilon implements the interface Theta.
 * 
 * @author Grace Keane
 * @version 15
 * 
 */
public class Epsilon implements Theta{
	
	/**
	 * Method epsilon takes in a value and returnes the length of that value.
	 * 
	 * @param String value operand one
	 * @return returns the length of the value
	 *  
	 */
	public int epsilon(String value) {
		return value.length();
	}

	/**
	 * When method epsilonTest() is called it prints a simple statement along
	 * with its class address and hash code.
	 * This test clarifies that Epsilon can be accessed in Alpha by calling
	 * the interface methods in Theta.
	 * 
	 * @return returns null
	 *  
	 */
	public String epsilonTest() {
		System.out.println("Epsilon.java is executing! " + "Class dddress: " + this.getClass().getName() + " Hash Code: " + hashCode());
		return null;
	}

	/**
	 * Overriding object Theta specified in the interface class. 
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
	 * Overriding the delta method specified in the Theta interface class. 
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
	 * Overriding the deltaTest specified in the interface class. 
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
	 * Overriding the zeta method specified in the interface class. 
	 * 
	 * @param String v operand one
	 * @return returns 0
	 *  
	 */
	@Override
	public int zeta(String v) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Overriding the zetaTest method specified in the interface class. 
	 * 
	 * @return returns null
	 *  
	 */
	@Override
	public String zetaTest() {
		// TODO Auto-generated method stub
		return null;
	}
}
