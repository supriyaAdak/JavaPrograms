import java.io.*;
import java.util.*;

class LeapYear
{
public static void main(String args[])
{
boolean leap = false;
System.out.println("Enter a year");
while(true)
{

Scanner sc = new Scanner(System.in);
 int input = sc.nextInt();
String toStringForRead = String.valueOf(input); // conversion to string 

if(toStringForRead.length()>=4)

{
if (((input % 4 == 0) && (input % 100!= 0)) || (input%400 == 0))
{
System.out.println("year"+input+" The Year is  a leap year.");

}
 else

System.out.println(input+ " is not a leap year.");
break;
 }
else 
{
System.out.println("The year should be 4 Integer");
}
}
}
}


