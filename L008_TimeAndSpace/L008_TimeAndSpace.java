import java.io.*;
import java.util.*;

public class Main {
    // ------bubble sort #WAY-1------
    public static void bubble(int arr[], int n) {

        //Write your code here.
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    // ------bubble sort #WAY-2------
    
    // ------selection sort #WAY-1------
    public static int moveToStart(int[] arr, int si, int ei) {
        int smallIdx = si;
        for (int i = si + 1; i <= ei; i++) {
            if (isSmaller(arr, i, smallIdx)) smallIdx = i;
            }
            return smallIdx;
        }

        public static void selectionSort(int[] arr) {
            //write your code here
            int n = arr.length;
            int ei = n - 1;
            for (int i = 0; i < n - 1; i++) {
                int idx = moveToStart(arr, i , ei);
                swap(arr, i , idx);
            }
        }
    // ------selection sort #WAY-2------ 
    public static int moveToStart(int[] arr, int si, int ei) {
        int smallIdx = si;
        for (int i = si + 1; i <= ei; i++) {
            if (arr[smallIdx] > arr[i])) smallIdx = i;
            }
            return smallIdx;
        }

        public static void selectionSort(int[] arr) {
            //write your code here
            int n = arr.length;
            int ei = n - 1;
            for (int i = 0; i < n - 1; i++) {
                int idx = moveToStart(arr, i , ei);
                swap(arr, i , idx);
            }
        } 
        // used for swapping ith and jth elements of array
        public static void swap(int[] arr, int i, int j) {
            System.out.println("Swapping " + arr[i] + " and " + arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // return true if ith element is smaller than jth element
        public static boolean isSmaller(int[] arr, int i, int j) {
            System.out.println("Comparing " + arr[i] + " and " + arr[j]);
            if (arr[i] < arr[j]) {
                return true;
            } else {
                return false;
            }
        }

        public static void print(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            selectionSort(arr);
            print(arr);
        }

    }