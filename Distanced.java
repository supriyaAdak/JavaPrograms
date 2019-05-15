
import java.io.*;
import java.util.*;
class Distanced
{
	public static void main(String args[])
	
	{    
 
		double dis;
             
               Scanner sc = new Scanner (System.in);
               System.out.println("enter the value of distance point from origin X1:");
               float x1 = sc.nextInt();
               System.out.println("enter the value of distance point from origin X2 :");
               float y1 = sc.nextInt();
               float x2 =0;
               float y2 =0;
		     
	        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	        
  	        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")=>"+dis);
 
	}
}
