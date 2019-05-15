import java.io.*;
import java.util.*;

public class Quadratic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
          double a= sc.nextInt();
        System.out.println("Enter value of b:");
          double b= sc.nextInt();
        System.out.println("Enter value of c:");
          double c= sc.nextInt();
        double root1, root2;

        double determinant = b * b - 4 * a * c;

     
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format( root1 , root2);
        }
        
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.format(root1);
        }
     
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format( realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
