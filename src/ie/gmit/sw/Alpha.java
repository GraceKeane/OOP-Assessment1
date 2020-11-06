package ie.gmit.sw;

/**
 * Alpha is the runner class and it is composed with interfaces from Iota.java and .
 * It creates new objects, calls interface methods, then prints out data from specific class. 
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
		
		// Calling interface methods.
		// Should navigate to main method e.g. gamma in Gamma.java then print out results.
		g.gamma();
		b.beta();
		
	}
}
	

	
	
	
	/*
	
	// 	Returnes an instance of Object based on status and dayofweek
	
		}else {
			//Delta, Epsilon and Zeta handle more complex situations
			DayOfWeek day = LocalDate.now().getDayOfWeek();
			return switch (day) {
				case MONDAY, TUESDAY -> delta.delta(day.name());
				case WEDNESDAY, THURSDAY -> epsilon.epsilon(day.name());
				case FRIDAY -> zeta.zeta(day.name());
				case SATURDAY -> Integer.valueOf((delta.delta(day.name()) + epsilon.epsilon(day.name()))); 
				case SUNDAY -> Integer.valueOf((epsilon.epsilon(day.name()) + zeta.zeta(day.name())));
			};			
		}
	}
}*/
