import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scn = new Scanner(System.in);
      String input;
      int x = 0;
   
   while( x <= 1){
      
      input = scn.nextLine();
      int z = input.length();
      
      if (input.equals("Done") ||input.equals("done") ||input.equals("d")){
         x++;
         break;
         }//if
      else 
         for(int i = z - 1; i >= 0; --i){
            System.out.print(input.charAt(i));
         }//for
    
    System.out.println();
   }//while
   }
}
