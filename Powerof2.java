import java.io.*;
import java.util.*;
 class Powerof2
{
 public static void main(String args[])
 { 
   System.out.println("Enter the Index");
   while(true)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input <=31)
        {
          for(int i=0; i<=input;i++)
           {
               double power = Math.pow(2,i);
               int value = (int)power ;
               System.out.println("the power of 2 table is printed :"+value);

           }
        break;
    }
else
     {
          System.out.println("enter the power index less than 31");
         break;
      }

 }

 }
}
