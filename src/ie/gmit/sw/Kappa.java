package ie.gmit.sw;

/**
 * This is Kappa which is overriding the method inside of Theta if called.
 * The string in this class overrides Theta's if day is Saturday
 * 
 * @author Daniel Gallagher
 * @version 1.0
 */
public class Kappa implements Theta{
	@Override
	public int Theta(String value) {
		return value.hashCode();
	}
}