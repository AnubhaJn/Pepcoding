import java.io.*;
import java.util.*;

public class L006_Recursion{ 
    //decreasing
    public static void printDecreasing(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

    //increasing
    public static void printIncreasing(int n) {
        if (n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);
   }

    //increasingdecreasing
    public static void pdi(int n) {
        if (n == 0) return;
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }

   //factorial
    public static int factorial(int n) {
        if (n == 1) return 1;
        int fact = n * factorial(n - 1);
        return fact;
    }

   // power by algebraic
    public static int power(int x, int n) {
        if (n == 0) return 1;
        int num = power(x, n - 1) * x;
        return num;
   }

  //power by log (x^n/2 * x^n/2)
    public static int power(int x, int n) {
        if (n == 0 ) return 1;
        int ans =  power(x,n/2) * power(x,n/2);
        if ( n% 2 == 1) ans *= x;
        return ans;
   }

   //printing pre, in, post zigzag
   public static void pzz(int n) {
    if(n==0){
        return ;
    }
    System.out.print(n + " " );
    pzz(n-1);
    System.out.print(n + " ");
    pzz(n-1);
    System.out.print(n + " ");
   }

   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.next();
    printDecreasing(n);
}
}

