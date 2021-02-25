import java.io.*;
import java.util.*;
import java.util.Scanner;


public class L006_RecursionInArray{ 
    // array input
    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    //display array
    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length) return;
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }

    //display array in reverse
    public static void displayArrReverse(int[] arr, int idx) {
        if(idx < 0) return;
        System.out.println(arr[idx]);
        displayArrReverse(arr, idx-1);
        }
    }

    // max of array
    public static int maxOfArray(int[] arr, int idx) {
        if (idx > arr.length-1) return (int) - 1e9;
        int maxEle = maxOfArray(arr, idx + 1);
        return Math.max(arr[idx], maxEle);
    }

    //first index
    public static int firstIndex(int[] arr, int idx, int data) {
        if (idx == arr.length) return -1;
        if(arr[idx]== data) return idx;
        return firstIndex(arr, idx+1,data);
    }

    //last index
    public static int LastIndex(int[] arr, int idx, int data) {
        if (idx <0 ) return -1;
        if(arr[idx]== data) return idx;
        return LastIndex(arr, idx-1,data);
    } 
    //--or--
    public static int LastIndex(int[] arr, int idx, int data) {
        if (idx == arr.length) return -1;
        int ans = LastIndex(arr, idx + 1, data);
        if(ans != -1) return ans;
        return arr[idx] == data ? idx : -1;
        
    }

    //display all indicies
    public static int[] allIndices(int[] arr, int data, int idx, int count) {
    // write ur code here

    if (idx == arr.length){
        int[] base = new int[count];
        return base;
    }
    if(arr[idx] == data) count++;
    int[]ans =  allIndices(arr,data, idx+1 , count);
    if (arr[idx] == data) ans[count-1] = idx;
    return ans; 
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        displayArr(arr, 0);

    }
   

} 
