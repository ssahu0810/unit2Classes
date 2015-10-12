import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author Sejal Sahu 
 * @version 10/7/2015
 */

public class Building
{
    /** Used to specify location and dimensions of building */
    private int xLeft;
    private int height;
    private int width;

    /**
     * Constructor for objects of class Building
     */
    public Building(int x, int y, int z)
    {
        // initialise instance variables
        xLeft = x * 20;
        width = y * 20;
        height = z * 20;
    }

    /**
     * Draws and colors building
     * 
     * @param  Graphics2D   Used to draw stuff
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        //Makes and colors building
        Rectangle body = new Rectangle(xLeft, 400 - height, width, height);
        g2.draw(body);
        g2.setColor(Color.BLACK);
        g2.fill(body);
        int paneLeft = xLeft + 4;
        
        //Fills building with window panels automatically
        while (paneLeft < xLeft + width){
            for( int paneTop = 400 - height + 4; paneTop < 400; paneTop += 20 )
            {
                Rectangle pane = new Rectangle(paneLeft,paneTop,12,12);
                g2.draw(pane);
                g2.setColor(Color.YELLOW);
                g2.fill(pane);
            }
            paneLeft += 20;
        }
        
        
    }
    
    
}
