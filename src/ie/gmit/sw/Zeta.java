package ie.gmit.sw;

public class Zeta implements Theta {
	public int zeta(String v) {
		return Integer.parseInt(v) + 7;
	}
	
	public String zetaTest() {
		System.out.println("Zeta.java is executing! " + "Class dddress: " + this.getClass().getName() + " Hash Code: " + hashCode());
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
	public String epsilonTest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int epsilon(String value) {
		// TODO Auto-generated method stub
		return 0;
	}
}