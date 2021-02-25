import java.io.*;
import java.util.*;

public class Solution {
    public static Scanner scn = new Scanner(System.in);
    
    //Recursion_16SumOfDigitInString (when number is given in string)
    public static int sumOfDigits(String str, int idx){
        if(idx == str.length()) return 0;
        int recAns = sumOfDigits (str, idx+1);
        return recAns+(str.charAt(idx)- '0') ;
        
    }

    //Recursion_17NumberToString
    public static long stringToInt(String str, int idx, long pow ){
        if (idx == -1) return 0;
        long recAns = stringToInt(str, idx -1 , pow * 10);
        return recAns + (str.charAt(idx) - '0') * pow ;
        
    }

    // Recursion_18StringOneTwoAreReverse 
    public static boolean checkReverse(String str1, int idx1, String str2, int idx2){
        if(idx2 == -1) return true;
        if (str1.charAt(idx1) != str2.charAt(idx2)) return false;
        return checkReverse(str1, idx1 +1, str2, idx2-1);
        
    }

    //Recursion_19PalindromeOfString
    public static boolean PalindromeString(String str,int i , int j){
        if (i >= j) return true;
        int diff1 = (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' )? str.charAt(i)- 'A' : str.charAt(i) - 'a';
        int diff2 = (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z' )? str.charAt(j)- 'A' : str.charAt(j) - 'a';
        if (diff1 != diff2) return false;
        return PalindromeString(str, i+1 , j-1);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        
        if (str1.length() == str2.length())
            System.out.println(checkReverse(str1 , 0, str2 , str2.length()-1 ));
        else System.out.println ("false");

        //System.out.println(sumOfDigits(str, 0));
    }
}