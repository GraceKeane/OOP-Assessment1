package ie.gmit.sw;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Alpha is the runner class and it is composed with interfaces from Iota.java and Theta.java.
 * It creates new objects, calls interface methods, then prints out data from specific classes. 
 * 
 * @author Grace Keane
 * @version 15
 * 
 */

public class Alpha {
	
	public static void main (String [] args){
		
		// Passing interface into Alpha & creating new objects
		Iota g = new Gamma();
		Iota b = new Beta();
		Theta d = new Delta();
		Theta e = new Epsilon();
		Theta z = new Zeta();
		
		// Calling Iota.java interface methods.
		// Navigates to interface and then calls method specified.
		g.gamma();
		b.beta();
		
		// Calling Theta.java interface methods.
		// Navigates to interface and then calls method specified.
		d.deltaTest();
		e.epsilonTest();
		z.zetaTest();
		
		
		//Delta, Epsilon and Zeta handle more complex situations
		DayOfWeek day = LocalDate.now().getDayOfWeek();
		
		// Switch statement for day
		 switch (day) {
			case MONDAY, TUESDAY -> d.delta(day.name());
			case WEDNESDAY, THURSDAY -> e.epsilon(day.name());
			case FRIDAY -> z.zeta(day.name());
			case SATURDAY -> Integer.valueOf((d.delta(day.name()) + e.epsilon(day.name()))); 
			case SUNDAY -> Integer.valueOf((e.epsilon(day.name()) + z.zeta(day.name())));
		 }
	}
}
		
	
