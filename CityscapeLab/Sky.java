import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
 * Draws and colors the sky
 * 
 * @author Sejal Sahu 
 * @version 10/11/2015
 */
public class Sky
{
    
    /**
     * Constructor for objects of class Sky
     */
    public Sky()
    {
        // initialise instance variables
    }

    /**
     * Draws and fills sky with set coordinates and dimensions
     * 
     * @param  g2   Used to draw stuff
     * 
     */
    public void draw(Graphics2D g2)
    {
        // Draws and fills the sky
        Rectangle body = new Rectangle(0,0,800,400);
        g2.draw(body);
        Color sky_color = new Color(41,56,61);
        g2.setColor(sky_color);
        g2.fill(body);
    }
}
