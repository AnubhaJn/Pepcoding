import java.util.*;
public class L001{
    public static scanner scn = new Scanner(System.in)

    public static void printHello() {
        System.out.print("Hi there!");
        System.out.print("This is Anubha.");
    }
 
 public static void workWithDataType(){
     int a=30;
     int b=10;

     System.out.println("Value of a:"+a);
     System.out.println("Value of b:"+b);
 }

 public static void printz(){
     System.out.println("*****");
     System.out.println("   *");
     System.out.println("  *");
     System.out.println(" *");
     System.out.println("*****");

 }
  public static void gradingSystem(int n){
      if (n>90){
          System.out.println("excellent");
      }else if(n>80 && n<=90){
          System.out.println("good");
      }
      else if(n>70 && n<= 80){
          System.out.println("fair");
      }
      else if(n>60 && n<=70){
          System.out.println("meets expectations");
      }
      else{
          System.out.println("below par");
      }
  }
  public static void noEvenOrOdd(n){
      int remainder = n%2;
      if (remainder==1){
          System.out.println("Odd number");
      }
      else 
      {
          System.out.println("Even number");
      }
  }

  public static void boolean isPrime_(int n){
      boolean prime= true;
      for(int i= 2; i*i < n ; i++){
       if(n % i == 0){
           prime  = false;
           break;
       }
      }
      return prime;
  }

   public static void isPrime(){
     int n=scn.nextInt();
     boolean ans= isPrime_(n);

     if(ans) System.out.println("prime");
     else System.out.println("not prime");
  }
  public static void printAllPrime(int a, int b){
      for (int i=a, i<=b ; i++){
          boolean ans = isPrime_(i);
          if(ans) System.out.println(i);
      }
  }
  
  public static void printFibo(int n){
      
      int a=0,b=1;
      for (int i=1; i<= n;i++)
      { System.out.println(a);
        int sum = a+b;
        a=b;
        b=sum;
      }
     }  

public static int countDigits(int n){
        int count = 0;
        int num = n;
        
        while (num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
    
    public static void Digits(int n){
        int num = n;
        int len = countDigits(num);
        
        int div = 1;
        while ( len-- >1){
            div *= 10;
        }
        while (div != 0){
            System.out.println(n/div);
            n = n% div;
            div /= 10;
        }
    }
    public static void lcm(int a, int b) {
    int max = 0 ;
     max = (a > b) ? a : b;
     do {
        if (max % a == 0 && max % b == 0) {
            System.out.println(max);
            break;
        } else
            ++max;
    } while (true);
}

    public static void gcd(int a, int b){
    while(a % b != 0){
       int remainder = a % b;
       a = b ;
       b = remainder;
    }
    System.out.println(b);
    public static int greatest(int a, int b, int c) {
        int great = (a > b) ? a : (b > c ? b : c);
        return great;
    }

    public static void pythogoranTriplet(int a, int b, int c) {
        int great = greatest(a, b, c);
        if (great == a) {
            boolean flag = (a * a == (b * b + c * c));
            System.out.println(flag);
        }
      else if (great == b) {
        boolean flag = (b * b == (a * a + c * c));
        System.out.println(flag);

    } else {
        boolean flag = (c * c == (a * a + b * b));
        System.out.println(flag);

    }

}
}
    public static void prinrTrianglePattern1(int row){
        int nst = 1;
        for (int r = 1; r<= row ; r++){
            for (int cst =1; cst<=nst ; cst++){
                System.out.print("*\t");
            }
            nst++;
             System.out.println();
        }
        
    }

     public static void printtrianglePattern2(int row) {
    int nst = row;
    for (int r = 1; r <= row; r++) {
        for (int cst = 1; cst <= nst; cst++) {
          System.out.print("*\t");
        }
        nst--;
        System.out.println("");
    }

}
void printTrianglePattern3(int row){
    int nst = 1;
    int nsp = row - 1;
    
    for (int r=1; r<= row; r++){
        for (int csp=1 ;csp <= nsp; csp++ ){
            System.out.print("\t");
        }
        for (int cst=1; cst<= nst; cst++){
            System.out.print("*\t");
            
        }
        
        nst++;
        nsp--;
        System.out.println("");
    }
    
}
public static void printTrianglePattern4(int row){
    int nst = row;
    int nsp = 0;
    
    for (int r=1; r<= row; r++){
        for (int csp=1 ;csp <= nsp; csp++ ){
            System.out.print("\t");
        }
        for (int cst=1; cst<= nst; cst++){
             System.out.print("*\t");
        }
        
        nst--;
        nsp++;
        System.out.println();
    }
    
}


public static void printDiamondPattern5(int row){
        int nst = 1;
        int nsp = row / 2;
        for (int r = 1 ; r <= row ; r++){
            for ( int csp=1 ; csp <= nsp ; csp++){
                System.out.print("\t");
            }
            for ( int cst=1 ; cst <= nst; cst++){
                System.out.print("*\t");
        }
        if(r <= row / 2){
            nsp--;
            nst+=2;
        }else{
            nsp++;
            nst-=2;
            }
        System.out.println();
    }
}

public static void hollowDiamondPattern6(int row){
    int nst = (row +1)/ 2;
    int nsp = 1;
    for (int r=1 ; r <= row ; r++){
        for(int cst=1 ; cst <= nst ; cst++){
            System.out.print("*\t");
        }
        for (int csp=1 ; csp <= nsp ; csp++){
            System.out.print("\t");
        }
        for (int cst=1 ; cst <= nst ; cst++){
            System.out.print("*\t");
        }
        if(r <=  row/2){
            nst--;
            nsp+= 2;
        }
        else{
            nsp-=2;
            nst++;
        }
        System.out.println();
    }
}


    public static void main(String[] args){
       // printHello();
       //workWithDataType();
       //FOR EVEN ODD
        int n = scn.nextInt();;
        noEvenOrOdd(n);
       //for prime
       int t= scn.nextInt();
       while (t-- > 0)
       {
           isPrime();
       }
      // FOR PRINTING PRIME BETWEEN NUMBERS
        int low = scn.nextInt();
        int high = scn.nextInt();
        printAllPrime(low,high);
         int n= scn.nextInt();
      printFibo(n);
        return 0;
    }
}