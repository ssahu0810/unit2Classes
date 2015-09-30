import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        
        System.out.print( "What is the rectagle length? ");
        int length = user_input.nextInt();
        
        System.out.print( "What is the rectangle width? ");
        int width = user_input.nextInt();
        
        int area = length * width;
        int perimeter = 2 * length * width;
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
        double diagonal = Math.sqrt(length * length + width * width);
        
        System.out.println("Diagonal: " + diagonal);
    }
}
