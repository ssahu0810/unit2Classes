
/**
 * Write a description of class MilkJarCalculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MilkJarCalculator
{
    public static void main(String[] args)
    {
        double milk = 5.5; // gallons
        double jarCapacity = 0.75; // gallons
        double completelyFilledJars = milk / jarCapacity;
        double completelyFilledJars2 = Math.round(completelyFilledJars);
        completelyFilledJars2 += completelyFilledJars + 1;
        
        System.out.println(completelyFilledJars2);
        
    }
}