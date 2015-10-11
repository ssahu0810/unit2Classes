import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int user_x;
    private Boat boat1;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(int user_x)
    {
        this.user_x = user_x;
        Boat boat1 = new Boat(100,500);
    }
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //Making the ocean and the sky
        Ocean o1 = new Ocean();
        o1.draw(g2);
        Sky s1 = new Sky();
        s1.draw(g2);
        
        //Making a bunch of buildings
        Building b1 = new Building(0,6,7);
        b1.draw(g2);
        Building b2 = new Building (7, 3, 9);
        b2.draw(g2);
        Building b3 = new Building(10,8,13);
        b3.draw(g2);
        Building b4 = new Building(19,5,8);
        b4.draw(g2);
        Building b5 = new Building(25,4,17);
        b5.draw(g2);
        Building b6 = new Building(30,2,16);
        b6.draw(g2);
        Building b7 = new Building(33,6,12);
        b7.draw(g2);
        Building b8 = new Building(40,6,15);
        b8.draw(g2);
        
        
        boat1.draw(g2);
    
        
        Moon m1 = new Moon(user_x, 100);
        m1.draw(g2);
        
    }
    
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        boat1.move();
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        this.repaint();
    }

}
