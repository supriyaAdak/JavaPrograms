import java.io.*;
import java.util.*;

class Harmonic 
{

   public static void main(String args[])
{ 
     System.out.println("Enter the Number");
while(true)
{
     Scanner sc = new Scanner(System.in);
     int input = sc.nextInt();
     double sum=0;
 if (input > 0)
  {
    for(double i =1; i<=input;i++)
     {
        
        sum = sum +1/i;
    

     }
System.out.println("the value of "+input+"harmonicis:"+sum);
break;
  }

else 
System.out.println("enter the value greater than zero");
}
}
}


     
   

