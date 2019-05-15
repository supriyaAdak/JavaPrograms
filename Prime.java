import java.io.*;
import java.util.*;
 
 public class Prime 
{

public static void main(String args[])
{
int  count; 
		
		System.out.println(" Prime Numbers from 1 to 1000 are : ");	
		for(int num = 1; num <= 1000; num++)
		{
			count = 0;
		    for (int i = 2; i <= num/2; i++)
		    {
		    	if(num % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && num != 1 )
		    {
		    	System.out.print(num + " ");
		    }  
		}
  
}
}


