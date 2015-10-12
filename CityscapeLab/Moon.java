import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Draws the moon at a user specified x coordinate
 * 
 * @author Sejal Sahu 
 * @version 10/11/2015
 */
public class Moon
{
    // Instance variables for moon base x and y coordinates
    private int xLeft;
    private int yTop;

    /**
     * Constructor for objects of class Moon
     * @param  x   Base x coordinate
     * @param  y   Base y coordinate
     * 
     */
    public Moon(int  x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws and fills the moon
     * 
     * @param  g2   Used to draw stuff
     *
     */
    public void draw (Graphics2D g2)
    {
        // Draws and fills the moon
        Ellipse2D.Double luna = new Ellipse2D.Double(xLeft, yTop, 50, 50);
        g2.draw(luna);
        g2.setColor(Color.WHITE);
        g2.fill(luna);
    }
}
