
/**
 * Write a description of class DistanceConverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceConverter
{
   public static final int FEET_IN_YARD = 3;
   public static final int INCHES_IN_YARD = 36;
    public static void main(String[] args)
   {
      double yards = 3.5;
      double feet = yards * FEET_IN_YARD;
      double inches = feet * INCHES_IN_YARD;
         
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}
