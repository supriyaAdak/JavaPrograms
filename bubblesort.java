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
          
              

String array[] = { "s", "u", "p", "r", "i", "y", "a" };
        
        BubbleString(array);
System.out.println();
      System.out.println("Enter an  Array");
        for(i=0; i<n; i++)
 
     {
      arr[i]=sc.nextInt();
     }
         for ( i=0;i<n;i++)
   {
    
      System.out.print(+arr[i]+"\t");
   }
          System.out.println("Given Array"); 
        printArray(arr); 
  
        sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr);       
                
               
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
public static void BubbleString(String [] array)
                {
                    
                   
                    for(int i=0; i<array.length;i++)
                      {
                        for(int j=i+1;j<array.length;j++)
                          {
                            if (array[j].compareTo(array[i])<0){
                                    String temp =array[j];
                                    array[j]=array[i];
                                    array[i]=temp;
                                  }
                           }
                         System.out.print(array[i]);
                    }
                          
                }   

public static void Merge(int arr[],int l,int m,int r)
        {

           int n1 = m - l + 1; 
           int n2 = r - m; 
           int L[] = new int [n1]; 
           int R[] = new int [n2];

           for (int i=0; i<n1; i++) 
            L[i] = arr[l + i]; 
           for (int j=0; j<n2; j++) 
            R[j] = arr[m + 1+ j];

          int i = 0, j = 0,k=l; 
          while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
 while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
 while (j < n2) 
        { 
            arr[k] = R[j]; 
           j++; 
            k++; 
        } 
        }
 static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted 
            Merge(arr, l, m, r); 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}

