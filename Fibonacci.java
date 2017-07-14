import java.io.*;
import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int n, t1 = 0, t2 = 1;
        Scanner ap = new Scanner(System.in);
        System.out.println(" enter the number");
           n = ap.nextInt();
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + "  ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
         
    }
}
