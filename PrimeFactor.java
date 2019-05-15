import java.io.*;
import java.util.*;

class PrimeFactor 
{

   public static void main (String args[])
 {
  System.out.println("Enter A number:");
  Scanner sc = new Scanner (System.in);
  int input = sc.nextInt();
  for(int i=2; i< input; i++)
            {
               
             while(input%i == 0)
               {
                  
                 System.out.println(i);
                 input = input/i
               }
            }
  }
}
