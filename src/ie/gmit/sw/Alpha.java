package ie.gmit.sw;

import java.time.*;

/**
* This class is taking in the status of s , depending on this status 
* the program will enter the if / else and return the correct overridden
* method from whichever class is used. For example if we get a status of
* slight we enter the first if and return the eta method overridden by
* beta , or if we have a status of high or extreme we are returning the
* overridden method depending on day (ie Monday returns Beta)
*
* @author Daniel Gallagher
* @version 1.0
*/
public class Alpha {
	//New instances of theta and eta.
	private Theta theta;
	private Eta eta;
    
	/**
	* The below statements are if / else statements we enter depending
	* on our status. In the first if / else there are 2 possible methods.
	* 
	* @param eta is either returning an overridden method from Beta or Gamma.
	* 
	* If we don't enter this statement we enter the else.
	* 
	* @param theta is then returning an overridden method depending on
	* the day of the week.
	*/
	public Object alpha(Status s) {
		
		//Items of status Slight or Low or Medium are handled by the Eta interface.
		//Anything else is being handled by Theta in the switch statment.
        
		if (s == Status.Slight || s == Status.Low) {
        	eta = new Beta();
            return eta.Eta();
        }else if (s == Status.Medium) {
        	eta = new Gamma();
            return eta.Eta();
        }else {
            //Delta, Epsilon and Zeta handle more complex situations.
        	//Switch statements are handled by the Theta interface depending on day of week.
        	DayOfWeek day = LocalDate.now().getDayOfWeek();
    			switch (day) {
    			  case MONDAY, TUESDAY:
    			    theta = new Delta();
    			  	return theta.Theta(day.name());
    			  case WEDNESDAY, THURSDAY:
    				theta = new Epsilon();
    			    return theta.Theta(day.name());
    			  case FRIDAY:
    				theta = new Zeta();
    				return theta.Theta(day.name());
    			  case SATURDAY:
    				theta = new Kappa();
    				return theta.Theta(day.name());
    			  case SUNDAY:
    				theta = new Sigma();
    				return theta.Theta(day.name());
    				
    			  default:
    				  return 0;
    			}
            }
        }
 
}