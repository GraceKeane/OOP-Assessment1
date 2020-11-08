package ie.gmit.sw;

/**
 * Class Delta implements the interface Theta.
 * 
 * @author Grace Keane
 * @version 15
 * 
 */
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Delta implements Theta {
	
	/**
	 * Method delta takes in a value and returnes an address
	 * hash code of that value.
	 * 
	 * @param String value operand one
	 * @return returns the hash code of the value
	 *  
	 */
	public int delta(String value) {
		return value.hashCode();
	}
	
	/**
	 * When method deltaTest() is called it prints a simple statement along
	 * with its class address and hash code. This test clarifies that Delta
	 * can be accessed in Alpha by calling the interface methods in Theta.
	 * 
	 * @return returns null
	 *  
	 */
	public String deltaTest() {
		System.out.println("Delta.java is executing! " + "Class dddress: " + this.getClass().getName() + " Hash Code: " + hashCode());
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
	 * Overriding the epsilonTest specified in the interface class. 
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
	 * Overriding the epsilon method specified in the interface class. 
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
