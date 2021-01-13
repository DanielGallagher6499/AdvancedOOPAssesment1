//Stays the same , but no longer declared inside Alpha.
package ie.gmit.sw;

/**
 * This is Zeta which is overriding the method inside of Theta if called.
 * The string in this class overrides Theta's if day is Friday
 * 
 * @author Daniel Gallagher
 * @version 1.0
 */
public class Zeta implements Theta{
	
	@Override
	public int Theta(String value) {
		return Integer.parseInt(value) + 7;
	}
}