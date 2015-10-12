import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;

/**
 * Makes boat object and also makes it move
 * 
 * @author Sejal Sahu 
 * @version 10/11/2015
 */
public class Boat
{
    // Used to specify boat location
    private int xLeft;
    private int yTop;

    /**
     * Constructor for objects of class Boat
     * 
     * @param  x   Base x coordinate of boat
     * @param  y   Base y coordinate of boat
     * 
     */
    public Boat(int x, int y)
    {
        // Standard boat position
        xLeft = x;
        yTop = y;
    }
    
    /**
     * Draws and fills boat
     * 
     * @param  g2   Used to draw stuff
     * 
     */
    public void draw(Graphics2D g2)
    {
        //Makes the main body and mast
        Rectangle body = new Rectangle(xLeft, yTop, 50, 20);
        Rectangle mast = new Rectangle(xLeft + 22, yTop - 40, 6, 40);
        
        //Making triangle shapes for front and back end for boats
        int[] xpoints1 = {xLeft - 20,xLeft,xLeft};
        int[] ypoints1 = {yTop,yTop,yTop + 20};
        Polygon triangle1 = new Polygon(xpoints1, ypoints1, 3);
        
        int[] xpoints2 = {xLeft + 50 + 20,xLeft + 50,xLeft + 50};
        int[] ypoints2 = {yTop,yTop,yTop + 20};
        Polygon triangle2 = new Polygon(xpoints2, ypoints2, 3);
        
        //Making the sails
        int[] xpoints3 = {xLeft - 20,xLeft + 22,xLeft + 22};
        int[] ypoints3 = {yTop - 10,yTop - 10,yTop - 40};
        Polygon sail1 = new Polygon(xpoints3, ypoints3, 3);
        
        int[] xpoints4 = {xLeft + 70,xLeft + 28,xLeft + 28};
        int[] ypoints4 = {yTop - 10,yTop - 10,yTop - 40};
        Polygon sail2 = new Polygon(xpoints4, ypoints4, 3);
        
        //Drawing stuff
        g2.draw(triangle1);
        g2.draw(triangle2);
        g2.draw(body);
        g2.draw(mast);
        g2.draw(sail1);
        g2.draw(sail1);
        
        //Filling stuff
        g2.setColor(Color.BLACK);
        g2.fill(triangle1);
        g2.fill(triangle2);
        g2.fill(body);
        g2.fill(mast);
        
        //Filling sails with different color
        g2.setColor(Color.WHITE);
        g2.fill(sail1);
        g2.fill(sail2);
    }
    
    /**
     * Makes the boat move 15 pixels to the right for each frame
     * 
     * 
     * 
     */
    public void move()
    {
        xLeft += 15;
        
    }
}
