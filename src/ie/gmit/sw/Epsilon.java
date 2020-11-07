package ie.gmit.sw;

public class Epsilon implements Theta{
	public int epsilon(String value) {
		return value.length();
	}
	
	
	public String epsilonTest() {
		System.out.println("Epsilon.java is executing! " + "Class dddress: " + this.getClass().getName() + " Hash Code: " + hashCode());
		return null;
	}


	@Override
	public Object Theta() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int delta(String value) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String deltaTest() {
		// TODO Auto-generated method stub
		return null;
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
