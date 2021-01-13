package ie.gmit.sw;

/**
 * This is Delta which is overriding the method inside of Theta if called.
 * The string value in this class overrides Thetas if it's Monday or Tuesday
 * 
 * @author Daniel Gallagher
 * @version 1.0
 */
public class Delta implements Theta{
	@Override
	public int Theta(String value) {
		return value.hashCode();
	}
}
