
import java.io.*;
import java.util.*;
public class PalindromePrime{
 
public static void main (String args[])
{
int  count; 
		
		System.out.println(" Prime Numbers from 1 to 1000 are : ");	
		for(int num = 1; num <= 100; num++)
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
		    	System.out.print("The Prime Number :"+num + " is a ");
		     
                         

                          int r,sum=0,temp;    
                          int n = num;
  
                          temp=n;    
                         while(n>0) 
                          {    
                           r=n%10;  
                           sum=(sum*10)+r;    
                           n=n/10;    
                          }    
                          if(temp==sum)    
                              System.out.println("palindrome number ");    
                   else    
                   System.out.println("not palindrome");    
	}	

  }
}
}
