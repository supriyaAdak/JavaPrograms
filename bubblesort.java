import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class bubblesort
{
  public static void main(String args[])
{
  int i;
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter no of elements:");

  int n = sc.nextInt();
  
  int[] arr  = new int[n];
  
  System.out.println("Enter no of elements in array");
  for(i=0; i<n; i++)
 
    {
      arr[i]=sc.nextInt();
    }

  for ( i=0;i<n;i++)
   {
    
      System.out.print(+arr[i]+"\t");
   }
     Bubble(arr);
     System.out.println("Array After BUBBLE Sort:");

      for( i = 0; i < arr.length; i++)
        {
         System.out.print(arr[i] + " \t");
        }
   Insert(arr);
       System.out.println("Array After INSERTION Sort:");

      for( i = 0; i < arr.length; i++)
        {
         System.out.print(arr[i] + " \t");
        }
      System.out.println("Enter a key to search an element from arraylist:");
             int index = sc.nextInt();
        System.out.println("index is"+index);
          int  high=arr.length-1;
        System.out.println("high is"+high);
        Binary(arr,index,high,0);
          
      
                 
                
               
}

public static void Bubble(int arr[])
    {
      int s=arr.length;
      for (int i=0; i< s-1;i++)
           {
              for (int j=0; j<s-1-i;j++)
                {
                  if(arr[j]>arr[j+1])
                     {
                       int temp =arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                     }
                }
            }
     }
 public static void Insert(int arr[])
     {
        int p = arr.length;
        for(int i=1;i<p;i++)
         {
           int key = arr[i];
           int j= i-1;
           while(j>=0 && arr[j]>key)
            {
              arr[j+1]=arr[j];
              j=j-1;
            }
           arr[j+1]=key;
         }
     }
public static void Binary(int arr[], int index, int high,int low)
     { 
        
        int mid =(high+low)/2;
          System.out.println("the value of mid is:"+mid);
        	while(low<=high)
                  {
                    if(arr[mid]<index)
                     {
                       low=mid+1;
                       System.out.println("The Value of Lower: " + low); 
                     }
                    else if (arr[mid]==index)
                     {
                        System.out.println("Element is found at index:: " + mid); 
                        break;
                     }
														
                   else 
                     {
                          high=mid-1;
                         System.out.println("The Value of higher: " + high); 
                     }
             mid= (high+low) /2;
             System.out.println(mid);
                 }
                   if ( high < low )
                   {  
                      System.out.println("Element is not found!");  
                    }
 }      

}

