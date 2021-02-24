import java.util.Scanner;//to use scanner for input

public class InputExample {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int birthMonth;
      int birthYear;

      /* Your solution goes here  */
      birthMonth = scnr.nextInt();
      birthYear = scnr.nextInt();
      System.out.println(birthMonth + "/" + birthYear);


      
        ////Data Types - primitive - int ( 32 bits) double, short, float,char, boolean,long, 
            // reference - string
        int xr = 10;
        int x = 15; // integer -2^31 -> 2^31 
        float z = 12.4f;//with out default data type is double for 12.4
       
        int sum = x + (x + x) % xr;
        double  sum1 = x/(float)xr; //casting - converting one data type to another
        /*
        implicit casting -
        vs 
         explicit casting -
        */
        
        System.out.println("Hello World \n" + sum );
        System.out.println(sum1);
        
        Scanner scn = new Scanner(System.in);
        //reading input
        x = scn.nextInt();
        
        System.out.println(x);
        
   }
}