import java.io.*;
import java.util.*;
public class FlipCoin
{
	 public static void main(String args[])
{
  System.out.println("Enter no. of coins to be tossed");
while(true)
{
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();

if(input >0){
double hp = Math.pow(0.5,input);
double tp = 1-hp;
System.out.println("head probability is:"+hp);
System.out.println("head probability percentage is:"+hp*100);
System.out.println("Tail probability is:"+tp);
System.out.println("Tail probability percentage is:"+tp*100);

if(Math.random() <0.5)
System.out.println("Tail");
else
System.out.println("head");
}
break;
else
{

System.out.println("Enter positive Integer");

}
}
}
}
