import java.util.*;
import java.util.Arrays;

public class L007_R&B{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int[][] dir = {{0,-1},{1,0}, {0,1},{-1,0}};
        String[] dirS = {"L","D","R","U"};

        int n = 3 , m = 3;
        boolean[][] vis = new boolean[n][m];
        System.out.println(floodFill(0,0,n-1,m-1,vis,dir,dirS, ""));
    }

    public static int floodFill(int sr, int sc, int er, int ec, boolean[][],vis,int[][] dir, String[] dirS, String ans){
        if (sr == er && sc == ec){
            System.out.println(ans);
            return 1;
        }

        vis[sr][sc] = true;
        int n = vis.length;
        int m = vis[0].length;
        int count = 0;
        for (int d ; d < dir.length ; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
        if (r >= 0 && c => 0 && r< n  && c<m && !vis[r][c]){
            count += floodFill(r,c,er,ec,vis,dir,dirS, ans + dirS[d]);
        }
    }
        vis[sr][sc]== false;
        return count;
    }
    public static int findTargetSumWays(int[] nums, int S,int idx) {
        //Write your code here
        if ( idx == nums.length) {
            return S == 0 ? 1 : 0 ;
        }
        int count = 0 ;
        count +=  findTargetSumWays(nums, S - nums[idx] , idx+1);
        count += findTargetSumWays(nums, S - (-nums[idx]) , idx+1);
        
        return count;
    }
    public static int printKnightsTour(int sr, int sc , int move ,int tnc, int[][] vis , int[][] dir) {
        if (move == tnc){
            vis[sr][sc]= move;
            displayBoard(vis);
            vis[sr][sc] = 0 ;
            return 0;
        }
        vis [sr][sc] = move;
        
        int n = vis.length;
        int m = vis[0].length;
        
        int count=0;
        for (int d = 0 ; d< dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            
            if (r >= 0 && c >= 0 && r<n && c< m &&  vis[r][c] == 0 ){
                count += printKnightsTour(r , c , move+1 , tnc, vis , dir);
            }
        }
        vis [sr][sc] = 0 ;
        return count;
      }
 }