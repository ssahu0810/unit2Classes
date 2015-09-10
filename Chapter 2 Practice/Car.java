
/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gas tank. The car can be driven a certain distance.
 * 
 * @author Sejal Sahu 
 * @version 9/10/25
 */
public class Car
{
    /** fuel efficiency of teh car miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** amount of fuel left in the car's tank in gallons */
    private double fuelInTank;

    /**
     * Constructor for objects of class Car that specifies the car efficiency
     */
    public Car( double fuelEfficiency)
    {
        // initialise instance variables
        fuelEfficiency = fuelEfficiency;
        fuelInTank = 0;
    }

    /**
     * Simulates driving the car the specified distance and reduces the amound of fuel in the tank
     * 
     * @pre     specified distance cannot result in the consumption of more gas than is available
     * @param  y   a sample parameter for a method
     */
    public void drive( double distance )
    {
   
    }
}
