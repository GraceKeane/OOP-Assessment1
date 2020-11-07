package ie.gmit.sw;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Alpha is the runner class and it is composed with interfaces from Iota.java and Theta.java.
 * It creates new objects, calls interface methods, then prints out data from specific classes. 
 * 
 * @author Grace Keane
 * @ Version 15
 * 
 */

public class Alpha {
	
	public static void main (String [] args){
		
		// Creating new objects
		Iota g = new Gamma();
		Iota b = new Beta();
		
		Theta d = new Delta();
		Theta e = new Epsilon();
		Theta z = new Zeta();
		
		// Calling interface methods.
		// Should navigate to main method e.g. gamma in Gamma.java then print out results.
		g.gamma();
		b.beta();
		
		d.deltaTest();
		e.epsilonTest();
		z.zetaTest();
		
		
		//Delta, Epsilon and Zeta handle more complex situations
		DayOfWeek day = LocalDate.now().getDayOfWeek();
		
		 switch (day) {
			case MONDAY, TUESDAY -> d.delta(day.name());
			case WEDNESDAY, THURSDAY -> e.epsilon(day.name());
			case FRIDAY -> z.zeta(day.name());
			case SATURDAY -> Integer.valueOf((d.delta(day.name()) + e.epsilon(day.name()))); 
			case SUNDAY -> Integer.valueOf((e.epsilon(day.name()) + z.zeta(day.name())));
		 }
	}
}
		
	
