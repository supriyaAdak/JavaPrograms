import java.io.*;
import java.util.*;
public class Coupon {

 public static int getCoupon(int n) {
System.out.println("the random value is:,"+Math.random());
        return (int) (Math.random() * n);
    }
public static int collect(int n) {
        boolean[] isCollected = new boolean[n];   
        int count = 0;                          
        int distinct  = 0; 
 while (distinct < n) {
            int value = getCoupon(n);            
            count++;                             
            if (!isCollected[value]) {           
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }
    public static void main(String[] args)
 {
        System.out.println("Enter no. of cards");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
         int count = collect(n);
        // total number of cards collected
        System.out.println(count);
    }
}
