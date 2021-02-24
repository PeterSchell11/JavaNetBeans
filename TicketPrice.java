import java.util.Scanner; 



public class TicketPrice {
  public static void printTicket(String nm, int ag){
 
    double tickPrice=0;

    if (ag<=13){
      tickPrice=9.99;}

    else if(13<ag && ag<65){
      tickPrice=19.99;}

    else if(ag>=65){
      tickPrice=12.99;}

      System.out.println ("\n--Ticket--");
      System.out.println ("Name: " + nm);
      System.out.println ("Age: " + ag);
      System.out.println ("Ticket Price: " +tickPrice);
  }
    
  public static void main(String[] args) {
    
    int age;
    Scanner scn = new Scanner(System.in);

    System.out.print ("Enter Name : ");
    String name = scn.nextLine();

    System.out.print ("Enter age : ");
    age = scn.nextInt();

    printTicket(name, age);
  }
}



  