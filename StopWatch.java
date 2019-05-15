
import java.io.*;
import java.util.*;

import java.lang.*;

public class StopWatch
{
    public static void main (String args[])
{
   Scanner sc = new Scanner(System.in);
   System.out.println("press 1 to start");
  int start = sc.nextInt();
 
 long StartTime = System.currentTimeMillis();

    System.out.println("press 0 to start");
   long startTime = sc.nextInt();

long Endtime = System.currentTimeMillis();

long Difference = Endtime- StartTime;

System.out.println("The difference is in milliseconds"+Difference);
System.out.println("The difference is in seconds"+Difference/1000);

}
}
 

