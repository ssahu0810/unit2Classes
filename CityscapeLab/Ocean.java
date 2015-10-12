import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
 * Draws and colors the ocean
 * 
 * @author Sejal Sahu 
 * @version 10/11/2015
 */
public class Ocean
{

    /**
     * Constructor for objects of class Ocean
     */
    public Ocean()
    {
        // No instance variables needed
    }

    /**
     * Draws and fills ocean with set coordinates and dimensions
     * 
     * @param  g2   Used to draw stuff
     * 
     */
    public void draw(Graphics2D g2)
    {
        // Draws and fills ocean
        Rectangle body = new Rectangle(0,400,800,200);
        g2.draw(body);
        Color ocean_color = new Color(0,68,255);
        g2.setColor(ocean_color);
        g2.fill(body);
    }
}
