import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
 * Write a description of class Ocean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean
{
    // instance variables - replace the example below with your own
    
    

    /**
     * Constructor for objects of class Ocean
     */
    public Ocean()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle body = new Rectangle(0,400,800,200);
        g2.draw(body);
        Color ocean_color = new Color(0,68,255);
        g2.setColor(ocean_color);
        g2.fill(body);
    }
}
