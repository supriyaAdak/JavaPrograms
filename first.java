import java.io.*;
import java.util.*;

 public class first {

 public static void main(String args[])
{
System.out.println("\nEnter the Username");

while (true) {
Scanner in = new Scanner(System.in);
String s = in.nextLine();

int len = s.length();


if (len>0 && len<3)
{
System.out.println("please enter username with minimum 3 characters");
}
else 
{

System.out.println("HEllo "+s+",how are you");
break;
}
}
}
}


