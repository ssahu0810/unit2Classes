
/**
 * Write a description of class CarComponent
 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class CarComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics g2 = (Graphics2D) g;
        
        Car car1 = new Car(0,0);
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        Car car2 = new Car(x,y);
        
        car1.draw(g2);
        car2.draw(g2);
    }
}
    