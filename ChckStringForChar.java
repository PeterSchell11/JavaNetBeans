import java.util.Scanner;

public class ChckStringForChar {
   public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      String s;
      char x;
      int count=0,z;
      
      x = scn.next().charAt(0);
      s = scn.nextLine();
      z = s.length();
      
      for ( int i=0; i < z; ++i){
       if (s.charAt(i) == x){
         ++count;
         
         }  
         
      }
      if (count==1)
      System.out.println(count + " " + x);
      else
      System.out.println(count + " " + x+"'s");
   }
}
