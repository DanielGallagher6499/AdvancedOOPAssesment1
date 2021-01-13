package ie.gmit.sw;

/**
 * This is Epsilon which is overriding the method inside of eta if called. 
 * The string in this class overrides Betas if Wedneday or Thursday
 * 
 * @author Daniel Gallagher
 * @version 1.0
 */
public class Epsilon implements Theta {
	
	@Override
	public int Theta(String value) {
		return value.length();
	}
}