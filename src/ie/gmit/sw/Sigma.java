package ie.gmit.sw;

/**
 * This is Sigma which is overriding the method inside of Theta if called.
 * The string in this class overrides Theta's if day is Sunday
 * 
 * @author Daniel Gallagher
 * @version 1.0
 */
public class Sigma implements Theta{
	@Override
	public int Theta(String value) {
		return value.hashCode();
	}
}