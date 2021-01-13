package ie.gmit.sw;

/**
 * This is Beta which is overriding the method inside of eta if called.
 * The string in this class overrides Eta's if status is slight or low
 * 
 * @author Daniel Gallagher
 * @version 1.0
 */
public class Beta implements Eta{
	@Override
	public String Eta() {
		return "Executing " + this.getClass().getName();
	}
}
