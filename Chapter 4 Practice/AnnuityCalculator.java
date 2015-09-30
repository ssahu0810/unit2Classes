import java.util.Scanner;
/**
 * Write a description of class AnnuityCalculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnnuityCalculator
{
    public static void main(String[] args)
    {
        //This program is broken!!!, go simple and have pre-defined variables
        
        double pmt;
        double years;
        double interest;
        double price;
        double stuff;
        double stuff2;
    
        Scanner s = new Scanner(System.in);
    
        double pmt = s.nextInt();
    
        //stuff is (1+i)^n-1
    
        stuff = Math.pow(1 + interest, years - 1);
        stuff2 = (stuff - 1)/interest;
        stuff2 = stuff2 / stuff;
        stuff2 += 1;
        price = pmt * stuff2;
    
}
  
            
}
