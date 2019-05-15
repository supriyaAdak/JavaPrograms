import java.io.*;
import java.util.*;

public class Gambler
{

public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println(Math.random()) ; 
System.out.println("Enter a stake");
  int stake = sc.nextInt();
System.out.println("enter a goals");
  int goals = sc.nextInt();
System.out.println("enter a trials");
  int trials = sc.nextInt();
int bets =0;
int wins = 0;
int goal= (int)goals ;
for (int t = 0; t < trials; t++)
 {

        
 int cash = stake;
            while (cash > 0 && cash < goals) 
{

                bets++;
                if (Math.random() < 0.5) 
cash++;                                              // win $1
                else                     
cash--;                                               // lose $1
}
            if (cash == goal) 
wins++;                                              // did gambler go achieve desired goal?
 }
 System.out.println("The No of times a person win :"+wins);
int win = wins*100/trials ;

System.out.println("Percent of games won = " + win);

int lose= 100-win;
System.out.println("Percent of games lose = " + lose);
     
}
}
