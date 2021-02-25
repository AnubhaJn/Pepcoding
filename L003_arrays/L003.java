import java.util.*;
import java.util.Arrays;

public class L003{
    public static Scanner scn = new Scanner(System.in);
    // conversion of decimal to any base
    public static int getValueInBase(int n, int b){
        int ans = 0;
        int p = 1;
        while(n>0){
            int digit = n % b;
            n = n /b;
            
            ans += digit * p;
            p = p*10;
        }
        return ans;
    }
    // conversion of base to decimal
    int getValueIndecimal(int n, int b){
        int ans = 0;
        int p = 1 ;
        while(n>0){
            int digit = n % 10 ;
            n = n /10 ;
            
            ans += digit * p;
            p = p * b;
        }
        return ans;
    }

    // any base Addition
    public static int anyBaseSum(int b, int n1, int n2){
        // write ur code here
        int res =0 , pow = 1, carry = 0;
        while(n1 !=0 || n2 != 0 || carry !=0 ){
            int n1Digit  = n1 % 10;
            int n2Digit  = n2 % 10;
            
            n1 /= 10;
            n2 /= 10;
            
            int sum = n1Digit + n2Digit + carry;
            int r = sum % b;
            carry = sum / b ;
            
            res += r * pow;
            pow *= 10; 
            
             }
             return res ;
    }
    
    // any base multiplication
    public static int getProduct(int b, int n1, int n2) {
        int myAns = 0;
        int power = 1;
        // write your code here
        while (n2 > 0) {
            int dign2 = n2 % 10;
            n2 /= 10;
            int productWithSngle = getProductWithSingleDigit( b , n1 , dign2);
             myAns = getSum(b, myAns , productWithSngle * power );
             power *= 10;
        }
        return myAns;
    }
    public static int getProductWithSingleDigit(int b, int n1, int dign2) {
        int ans = 0;
        int carry = 0;
        int power = 1;
        while ( n1 > 0 || carry > 0) {
            int dign1 = n1 % 10;
            n1 /= 10;

            int ansdig = (dign1 * dign2 + carry);
            carry = ansdig / b;
            ansdig = ansdig % b;

            ans = ans +  ansdig * power;
            power = power * 10;
        }
        return ans;
    }
    
    public static int maximumEle(int[] arr){
        int maxEle = -(int)1e8 ;
        for (int i= 0; i < arr.length ; i++){
            if (arr[i] > maxEle) maxEle = arr[i];
        }
        return maxEle;
    }
    
    public static int minimumEle(int[] arr){
        int minEle = (int)1e8 ;
        for (int i= 0; i < arr.length ; i++){
            if (arr[i] < minEle) minEle = arr[i];
        }
        return minEle;
    }
    
    public static int findEle(int[] arr, int data){
        int idx = -1;
        for(int i=0; i<arr.length;i++){
            if (arr[i]== data){
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static int firstIndex(int[] arr, int data){
        int idx = -1;
        for(int i=0; i<arr.length ;i++){
            if (arr[i]== data){
                idx = i;
                break;
            }
        }
        return idx;
    }
    public static int lastIndex(int[] arr, int data){
        int idx = -1;
        for(int i= arr.length - 1 ; i >= 0 ;i--){
            if (arr[i]== data){
                idx = i;
                break;
            }
        }
        return idx;
    }
    // reverse of an array
    public static void reverseArr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (int m = 0; m < arr.length ; m++) {
            System.out.print( arr[m] + " ");
        }
    }
    // inverse
    public static int[] inverse(int[] arr){
        int n= arr.length;
        int[ ]ans = new int[n];
        for(int i =0; i < n ; i++){
            ans[arr[i]] = i;
        }
        return ans;
      }
      // printing subarrays
      public static void printSubArray(int[] arr,int n) {
        for (int i=0 ; i < n ; i++) {
            for (int j = i; j < n ; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }

    //binary search
    public static int binarySearch(int[] arr, int data){
        int stinx = 0;
        int eninx = arr.length - 1 ;
        
        while (stinx <= eninx){
            ind mid = (stinx + eninx)/2;
            if (arr[mid] == data ){
                return mid ;
            }else if (data < arr[mid]){
                eninx = mid - 1 ;
            }else stinx = mid + 1;
        }
        return -1;
    }
    // ceil and floor
    public static void Ceil_Floor(int[] arr, int data) {

        int stidx = 0;
        int endidx = arr.length -1;
        int ceil = 0;
        int floor = 0;
        while (stidx <= endidx)  {
            int mid = (stidx + endidx) / 2;
            if (data > arr[mid] ) {
                stidx = mid + 1;
                floor = arr[mid];
            } else if (data < arr[mid]) {
                endidx = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid ];
                floor = arr[mid ];
                break;
            }
        }
        System.out.println (ceil);
        System.out.println (floor);
    }
    public static void barchat(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

    // sum of two arrays
    public static void sumOfArr(int[] arr1, int[] arr2, int n3){
        int[] sumArr = new int[n3];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sumArr.length - 1;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += arr1 [i];
            }
            if (j >= 0) {
                d += arr2 [j];
            }
            c = d / 10;
            d = d % 10;

            sumArr[k] = d;
            i--;
            j--;
            k--;

        }
        if (c != 0) System.out.println(c);
        for (int m = 0; m < sumArr.length; m++) {
            System.out.println(sumArr[m]);
        }
        
    }
    // differnce of two arrays
    public static void diffOfArray(int[] arr1,int[] arr2, int n2) {
        int[] diffArr = new int[n2];
        int borr = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diffArr.length - 1;
        while (k >= 0) {
            int diff = 0;
            int valueOfArr1 = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + borr >= valueOfArr1) {
                diff = arr2[j] + borr - valueOfArr1;
                borr = 0;
            } else {
                diff = arr2[j] + borr + 10 - valueOfArr1;
                borr = -1;
            }
            diffArr[k] = diff;
            i--;
            j--;
            k--;
        }
       int idx= 0;
       while(idx < diffArr.length){
           if (diffArr[idx] == 0){
               idx++;
           } else break;
       }
       while(idx < diffArr.length){
           System.out.println(diffArr[idx]);
           idx++;
       }
        
    }
    public static void main(String[] args){
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        //int data = scn.nextInt();
        System.out.println(maximumEle(arr));
         
    }

}
using namespace std;

int digiCount(int n){
        int num = n, count = 0;
        while(num != 0){
            num/= 10;
            count++;
        }
        return count;
    }

int rotate(int n , int r){
        int len = digiCount(n);
        r %= len;
        if(r > 0){
        int mul = 1, div =1;
        for(int i =1; i<= len; i++){
            if(i<=r)
            {
                mul *=10;}
            else 
            {
                div *= 10;}
        }

        int A = n % div;
        int B = n/div;

        return A*div + B;
    }else{ 
        int mul = 1, div =1;
        for(int i =1; i<= len; i++){
            if(i<=r)
            {
                mul *=10;}
            else 
            {
                div *= 10;}
        }

        int A = n % div ;
        int B = n/div;

        return A*mul + B;
        }
}

int main() {
    int n,r;
    cin>>r>>n;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    cout<<rotate(n,r);
    return 0;
}
