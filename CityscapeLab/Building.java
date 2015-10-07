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
    private int yTop;

    /**
     * Constructor for objects of class Building
     */
    public Building(int x, int y)
    {
        // initialise instance variables
        xLeft =  x;
        yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(xLeft, yTop + 150, 100, 600);
        g2.draw(body);
        g2.setColor(Color.BLACK);
        g2.fill(body);
        
        
        for( int paneTop = yTop + 2; paneTop < yTop + 390; paneTop += 25 )
        {
            Rectangle pane = new Rectangle(xLeft + 5,paneTop + 150,20,20);
            g2.draw(pane);
            g2.setColor(Color.YELLOW);
            g2.fill(pane);
        }
        
        
    }
    
    
}
