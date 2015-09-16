
/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gas tank. 
 * The car can be driven a certain distance.
 * 
 * @author Sejal Sahu 
 * @version 9/10/25
 */
public class Car
{
    /** fuel efficiency of the car miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** amount of fuel left in the car's tank in gallons */
    private double fuelInTank;

    /**
     * Constructor for objects of class Car that specifies the car efficiency
     */
    public Car( double fuelEfficiency)
    {
        // initialise instance variables
        this.fuelEfficiency = fuelEfficiency;
        this.fuelInTank = 0;
    }

    /**
     * Simulates driving the car the specified distance and reduces the amound of fuel in the tank
     * 
     * @pre     specified distance cannot result in the consumption of more gas than is available
     * @param   distance    distance that car drives in miles
     */
    public void drive( double distance )
    {
        this.fuelInTank -= distance / this.fuelEfficiency;
   
    }
    

    /**
     * Returns the amount of gas
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }
    

    /**
     * Increments the fuel in the car's tank by the specified amounf in gallons 
     *
     * @pre     gallonsOfGas must be a positiv number
     * @param   gallonsOfGas amount of gas to add to the car's tank in gallons
     * @return     the sum of x and y
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;
    }

}


