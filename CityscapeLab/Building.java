import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Building
{
    // instance variables
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(xLeft, 400 - height, width, height);
        g2.draw(body);
        g2.setColor(Color.BLACK);
        g2.fill(body);
        int paneLeft = xLeft + 4;
        
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
