
/**
 * Write a description of class Door here.
 * 
 * @Sejal Sahu
 * @9/15/2015
 */
public class Door
{
    // instance variables - replace the example below with your own
    private boolean isLocked;
    private boolean isOpened;
    

    /**
     * Constructor for objects of class Door
     */
    public Door()
    {
        // initialise instance 
        this.isLocked = false;
        this.isOpened = false;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Door(boolean locked, boolean opened)
    {
        // put your code here
        this.isLocked = locked;
        this.isOpened = opened;
    }
    
    public void lock()
    {
        this.isLocked = true;
    }
    
    public void open()
    {
        if( this.isLocked == false )
        {
            this.isOpened = true;
        }
    }
    
    public void close()
    {
        this.isOpened = false;
    }
    
    // personal style would ve to call this method isLocked,
    // but I'm trying to be consistent with other ezanples
    public boolean getLocked()
    {
        return this.isLocked;
    }
    
    // personal style would ve to call this method isOpened,
    // but I'm trying to be consistent with other ezanples
    public boolean getOpened()
    {
        return this.isOpened;
    }
}

