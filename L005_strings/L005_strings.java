import java.io.*;
import java.util.*;

public class L005_strings{

    public static void allSubString(String str) {
        //write your code here
        for (int i =0; i < str.length() ; i++){
            for (int j = 1 ; i+j <= str.length(); j++){
                System.out.println(str.substring(i, j+i));
            }
        }
    }
    public static boolean isPalindrome(String str){
        int i = 0 , j = str.length()-1;
        while(i<j){
            if (str.charAt(i++)!= str.charAt(j--)) return false;
        }
         return true;
    }
    public static String withoutx(String str) {
        StringBuilder sb = new StringBuilder();
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') continue;
            else sb.append(str.charAt(i));
            // if (i < 2 && str.charAt(i) != 'x') sb.append(str.charAt(i));
            //if (i >= 2) sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void toCaptalizeFirstLetter(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        StringBuilder sb = new StringBuilder();
         sb.append ( A.substring(0,1).toUpperCase());
        StringBuilder sb1 = new StringBuilder();
         sb1.append( B.substring(0,1).toUpperCase());
         System.out.println(sb.toString()+ A.substring(1) +" " + sb1.toString() + B.substring(1));
        
    }
    public static String toggleCase(String str) {
        //write your code here
       StringBuilder sb= new StringBuilder();
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                sb.append((char)(str.charAt(i) - 'A' +'a'));
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                sb.append((char)(str.charAt(i) +'A' -'a'));
            }
        }

        return sb.toString();
    }
    public static ArrayList<Integer> noOfOccurance(String str , char ch){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0 ; i < str.length(); i++){
            if (str.charAt(i) == ch ) arr.add(i);
        }
        return arr;
    }
    
    // REMOVE PRIMES
    public static boolean isPrime(int n){
        for (int i=2 ; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void solution(ArrayList < Integer > al) {
        // write your code here
        ArrayList <Integer> ans = new ArrayList<> ();
        for (int ele : al){
            if( ! isPrime(ele)) ans.add(ele);
        }
        
        al.clear();
        for(int ele : ans) al.add(ele);
    }

    // permutation
    public static void appendCharInString(String str, char ch, ArrayList<String> ans){
        for (int i=0 ; i <= str.length(); i++){
            String s = str.substring(0,i) + ch 
            + str.substring(i);
            ans.add(s);
        }
    }

    public static ArrayList<String> permutation(String str) {
        // write your code here
        ArrayList<String> ans = new ArrayList<> ();
        ans.add("");
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            ArrayList<String> smallAns = new ArrayList<>();
            for(String s : ans){
                appendCharInString(s,ch,smallAns);
                ans = smallAns;
            }
        }
          return ans;
    }

    // Reverse String2 LeetCode 
    void reverseRange(char[] arr , int i, int j){
        while(i<j){
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j]= ch;
            
            i++;
            j--;
        }
    }

    public String reverseStr(String s, int k) {
        if ( k == 0|| k == 1 || s.length() <= 1) return s;
        
        int i = 0 , n = s.length();
        char[] arr = s.toCharArray();
        while(i< n){
            if(i + k -1 < n){
                reverseRange(arr , i , i+k-1);
                i += 2*k ;
            }else { 
                reverseRange(arr , i , n-1);
                break;
                  }
            }
       //StringBuilder sb = new StringBuilder();
       // for (char ch : arr) sb.append(ch);
       // return sb.toString();
        
        return new String(arr);
    }

// LeetCode 387. First Unique Character in a String
    public int firstUniqChar(String s) {
       
        int[] freq = new int[26];
        for (int i =0; i <s.length();i++){
            freq[s.charAt(i)- 'a']++;
        }
        for (int i =0 ; i<s.length() ; i++){
            if (freq[s.charAt(i)- 'a'] == 1) return i;
        }
        return -1;
    }
// representing a number in its prime factors
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void primeNumbers(int n, ArrayList <Integer> ans) {
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) ans.add(i);
        }
    }

    public static void primeFactors(int num, ArrayList <Integer> list) {
        int idx = 0;
        while (num != 1 && idx < list.size()) {
            int count = 0;
            while (num % list.get(idx) == 0) {
                num /= list.get(idx);
                count++;
            }
            if (count > 0) {
                System.out.print(list.get(idx) + "^" + count + "  ");
            }
             idx++;
        }
        if (num > 1) System.out.print(num + "^" + "1  ");
        System.out.println();
    }
   public static void primeFactorsForQuery(int[] query){
       ArrayList<Integer> ans = new ArrayList<>();
       primeNumbers(10000,ans);
       
       for (int ele : query){
           primeFactors(ele,ans);
       }
   }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        allSubString(str);
    }

}