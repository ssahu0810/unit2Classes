

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /**
     * Default constructor for test class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testfillup()
    {
       VendingMachine machine1 = new VendingMachine( 15, 20 );
       machine1.fillup(5);
       assertEquals( 20.0, machine1.getCanCount(), 1e-6);
    }
    
    @Test
    public void inserttoken()
    {
        VendingMachine machine1 = new VendingMachine( 15, 20 );
        machine1.inserttoken();
        machine1.inserttoken();
        assertEquals( 18.0, machine1.getTokenCount(), 1e-6);
    }
    
    
}
