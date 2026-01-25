package ex_10_For_Loop;
import java.util.Scanner;
public class Triangle_Classifier {
   public static void main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first sides of a triangle : ");
     int a = sc.nextInt();

     Scanner sc1 = new Scanner (System.in);
     System.out.println("Enter the second sides of a triangle : ");
     int b = sc1.nextInt();

     Scanner sc2 = new Scanner (System.in);
     System.out.println("Enter the third sides of a triangle : ");
     int c = sc2.nextInt();

     if (a==b && a==c)
        {
            System.out.println("The triangle is equilateral ");
        }
    else if (b==a || b==c)
     {
         System.out.println("The triangle is isosceles  ");
     }
    else
     {
         System.out.println("The triangle is scalene  ");
     }
    }
}
