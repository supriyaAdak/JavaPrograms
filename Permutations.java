
import java.io.*;
import java.util.*;

class Permutations
{
	
	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
        }
	 

	
	private static void permutation(char[] ch, int Index)
	{
		   if (Index == ch.length - 1) 
                 {
			System.out.println(String.valueOf(ch));
		}

		for (int i = Index; i < ch.length; i++)
		{
			swap(ch,Index, i);
			permutation(ch, Index + 1);
			swap(ch,Index, i);
		}
	}

	
	public static void main(String[] args)
	{
		String s = "ABCA";
		permutation(s.toCharArray(), 0);
	}
}
