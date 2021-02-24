
package ChckPrmSumPrm;
import java.util.Scanner;

public class ChckPrmSumPrm {
    
    //tas1 one - write a method that checks if the number is prime or not 
    public static boolean checkPrime(int a){
        for (int i = 2; i <= a / 2; ++i) 
            if (a % i == 0) 
                return false;
             
        return true;
    }
    public static int primeSum(int n){
        int sum = 0;
        for(int i=2;i<=n;i++)
            if(checkPrime(i))
                sum+=i;
        return sum;
        
    }

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n= ");
        int n=sc.nextInt();
        System.out.println("The sum is  " + primeSum(n) );
        
       
    } 
    //tas2 one - write a program that finds the sum of all the prome numbers between 0 and a given number
    
    
}

class class2{
   
}

        