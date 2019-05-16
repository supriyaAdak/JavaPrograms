import java.io.*;
import java.util.*;
 
class Stringsort
{

public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter First string");
  String s = sc.nextLine();
  int n = s.length();
  int arr[]= new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=s.codePointAt(i);
  }
  System.out.println("The bubble sort of an array is :");
  Bubblesort(arr);
  System.out.println("The Insertion sort of an array is :");
  Insertionsort(arr);
  
}

public static void Bubblesort(int [] arr)
{
  int temp=0;
  int a= arr.length;
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<a-i-1;j++)
     {
       if(arr[j]>arr[j+1])
        {
           temp =arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
        }
     }
 }
String str= null;
for(int i:arr)
 {
  str= Character.toString((char)i);
   System.out.print(str);
 }
System.out.println();

}
public static void Insertionsort(int [] arr)
{
  int l =arr.length;
  for(int i=0;i<l;i++)
  {
  int key =arr[i];
  int j=i-1;
  while (j>=0 && arr[j]>key)
  {
       arr[j+1]=arr[j];
       j=j-1;
  }
    arr[j+1]=key;
  }
    String str= null;
      for(int i:arr)
  {
    str= Character.toString((char)i);
   System.out.print(str);
  }
System.out.println();

}

}
          
