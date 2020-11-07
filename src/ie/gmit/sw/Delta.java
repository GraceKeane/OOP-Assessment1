package ie.gmit.sw;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Delta implements Theta {
	
	public int delta(String value) {
		return value.hashCode();
	}
	
	public String deltaTest() {
		System.out.println("Delta.java is executing! " + "Class dddress: " + this.getClass().getName() + " Hash Code: " + hashCode());
		return null;
	}

	@Override
	public Object Theta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String epsilonTest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int epsilon(String value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int zeta(String v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String zetaTest() {
		// TODO Auto-generated method stub
		return null;
	}
}
