import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String str = scn.nextLine();
        //printSS(str, 0 , "");
        //StringBuilder ans = new StringBuilder();
        //printSSByStringBuilder(str, 0, ans);
        String[] arr = new String[subsequence(str, 0).size()]; 
        arr = subsequence(str, 0).toArray(arr); 
        for (int idx = arr.length-1; idx >= 0 ;idx --){
            System.out.println(arr[idx]);
        }
    }


 //Print Subsequence
    // using string i.e wayup
    public static void printSS(String str, int idx, String ans) {
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }
        printSS(str, idx + 1, ans + str.charAt(idx));
        printSS(str, idx + 1, ans);

    }

    //using stringbuilder i.e wayup
    public static void printSSByStringBuilder(String str, int idx, StringBuilder ans) {
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }
        ans.append(str.charAt(idx));
        printSSByStringBuilder(str, idx + 1, ans);
        ans.deleteCharAt(ans.length() - 1);
        printSSByStringBuilder(str, idx + 1, ans);

    }
    // using arraylist
    public static ArrayList < String > subsequence(String str, int idx) {

        if (idx == str.length()) {
        ArrayList < String > base = new ArrayList < > ();
        base.add("");
        return base;
    }
    ArrayList < String > recAns = subsequence(str, idx + 1);
    ArrayList < String > myAns = new ArrayList < > (recAns);
    char ch = str.charAt(idx);
    for (String ele: recAns) {
        myAns.add(ch + ele);
    }
    return myAns;
}
 
//---- get keypad codes
// with return type
static String[] codes = { ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList < String > getKPC(String str, int idx) {

        if (idx == str.length()) {
            ArrayList<String> base = new ArrayList <> ();
            base.add("");
            return base;
        }
        char ch = str.charAt(idx);
        String codesForCh = codes[ch - '0'];
        ArrayList < String > recAns = getKPC(str, idx + 1);
        ArrayList < String > myAns = new ArrayList<> ();

        for (int i = 0; i < codesForCh.length(); i++) {
            char chCodes = codesForCh.charAt(i);
            for (String s: recAns) {
                myAns.add(chCodes + s);
            }
        }
        return myAns;
    }

// with wayup
static String[] codes = { ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static void printKPC(String str, String ans, int idx) {
    if (idx == str.length()){
        System.out.println(ans);
        return ;
    }
   char ch = str.charAt(idx);
   String codesForch = codes[ch - '0'];
   for (int i = 0; i < codesForch.length() ; i++){
       char chCodes = codesForch.charAt(i);
       printKPC( str ,  ans + chCodes , idx + 1);
   }
}

// ---Get Stair Paths----
// with return type
public static ArrayList < String > getStairPaths(int n) {
    if (n == 0){
        ArrayList < String > base= new ArrayList<>();
        base.add("");
        return base;
    }else if (n<0){
        ArrayList < String > base= new ArrayList<>();
        return base;
    }
  ArrayList < String > paths1 =  getStairPaths(n-1);
  ArrayList < String > paths2 =  getStairPaths(n-2);
  ArrayList < String > paths3 =  getStairPaths(n-3);
  ArrayList < String > paths = new ArrayList<>();
 
 for (String path : paths1){
     paths.add(1+ path);
 }
 for (String path : paths2){
     paths.add(2+ path);
 }
 for (String path : paths3){
     paths.add(3+ path);
 }
 return paths;
}

//with wayup
public static void printStairPaths(int n, String path) {
    if (n == 0) {
        System.out.println(path);
        return;
    } else if (n < 0) return;


    printStairPaths(n - 1, path + "1" );
    printStairPaths(n - 2, path + "2");
    printStairPaths(n - 3, path + "3");
    }
}

//Print Maze Paths
    // wayup
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }
        if (sc + 1 <= dc)
            printMazePaths(sr, sc + 1, dr, dc, ans + 'h');
        if (sr + 1 <= dr)
        printMazePaths(sr+ 1, sc , dr, dc, ans+ 'v');
    }
}
//maze paths with jumps
    // return type

public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
    if(sr == dr && sc == dc){
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;
    }
    ArrayList<String> myAns = new ArrayList<>();
    for(int ms = 1 ; ms <= dc - sc ; ms++){
        ArrayList<String> horizontalPaths = getMazePaths(sr, sc + ms , dr , dc);
        for (String hpath : horizontalPaths){
            myAns.add("h"+ ms + hpath);
        }
    }
    for(int ms = 1 ; ms <= dr - sr ; ms++){
        ArrayList<String> verticalPaths = getMazePaths(sr + ms, sc , dr , dc);
        for (String vpath : verticalPaths){
            myAns.add("v"+ ms + vpath);
        }
    }
    for(int ms = 1 ; ms <= dc - sc && ms <= dr - sr ; ms++){
        ArrayList<String> diagonalPaths = getMazePaths(sr + ms, sc + ms , dr , dc);
        for (String dpath : diagonalPaths){
            myAns.add("d" + ms + dpath);
        }
    }
    return myAns;
}

----hiwithpep
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        
        String s=scn.next();
        
        int i=scn.nextInt();
        
        System.out.println(replaceHiWithPep(s,0).charAt(i));
        
        replaceHiWithPep_wayUp(s,0,"");
        
    }
    
    public static String replaceHiWithPep(String s,int idx){
        if(idx >= s.length()-1){
            if(idx == s.length()-1) return s.charAt(idx)+"";
            return "";
        }
        
        String sbs=s.substring(idx,idx+2);
        
        if(sbs.equals("hi")){
            return "pep" + replaceHiWithPep(s,idx+2);
        }
        else{
            return s.charAt(idx) + replaceHiWithPep(s,idx+1);
        }
    
    }
    
    public static void replaceHiWithPep_wayUp(String s,int idx,String ans){
        if(idx >= s.length()-1){
            if(idx == s.length()-1) ans+=s.charAt(idx);
            System.out.println(ans);
          
