package ie.gmit.sw;

/**
 * Class Beta implements the interface Iota.
 * 
 * @author Grace Keane
 * @ Version 15
 * 
 */

public class Beta implements Iota {
	
	public String beta() {
		System.out.println("Beta.java is executing! " + "Class dddress: " + this.getClass().getName());
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
		if (s == Status.Slight || s == Status.Low) {
			return beta();
		}
		return s;
	}

	@Override
	public String gamma() {
		// TODO Auto-generated method stub
		return null;
	}
}
