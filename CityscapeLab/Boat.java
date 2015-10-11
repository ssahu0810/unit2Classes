import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;

/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop;

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Boat(int x, int y)
    {
        // Standard boat position
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
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
        
        //Filling sails
        g2.setColor(Color.WHITE);
        g2.fill(sail1);
        g2.fill(sail2);
    }
}
