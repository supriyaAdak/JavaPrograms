import java.io.*;
import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 

public class Anagrams
{
  public static boolean IsAnagram(char [] str1 ,char[] str2)
{
   int n1 = str1.length;
   int n2 = str2.length;
    
   if (n1 != n2)
    return false;
         Arrays.sort(str1);
System.out.println(Arrays.toString(str1));
         Arrays.sort(str2);
System.out.println(Arrays.toString(str1));
         for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  return true ; 
}

public static void main (String args[])
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter First string");

    String s1 = scanner.next();
    System.out.println("Enter Second string");
    String s2 = scanner.next();
     char[] str1 = s1.toLowerCase().toCharArray();  
     char[] str2 = s2.toLowerCase().toCharArray();  

 if (IsAnagram(str1, str2)) 
            System.out.println("The two strings arr anagram of each other"); 
        else
            System.out.println("The two strings are not anagram of each other");
                                
    } 
}
 
   
