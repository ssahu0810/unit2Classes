
/**
 * Write a description of class VendingMachine here.
 * 
 * @Sejal (your name) 
 * @9/21/15 (a version number or a date)
 */
public class VendingMachine
{
    private int cans;
    private int cans_vending;
    private int tokens;

    /**
     * Constructor for objects of class VendingMachine
     */
    public VendingMachine( int cans_vending, int tokens )
    {
        // initialise instance variables
        this.cans_vending = cans_vending;
        this.tokens = tokens;
        this.cans = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void fillup(int cans)
    {
        // put your cod
        cans_vending += cans;
    }
    
    public void inserttoken()
    {
        // Instructions for updating the token and can counts
        
        tokens -= 1;
        cans -= 1;
        cans_vending += 1;
    }
    
    public int getCanCount()
    {
        return this.cans_vending;
    }
    
    public int getTokenCount()
    {
        return this.tokens;
        
    }
    
    
}
