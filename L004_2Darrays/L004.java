public static Scanner scn= new Scanner(System.in);
    public static void input2D(int[][] arr,int row , int col){
        for (int i=0 ; i< row ;i++){
            for (int j=0; j< col ; j++){
                arr[i][j]= scn.nextInt();
            }
        }
    }
    public static void output2D(int[][] arr,int row , int col){
        for (int i=0 ; i< row ;i++){
            for (int j=0; j< col ; j++){
                System.out.print (arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void saaddlePoint(int[][] arr){
        int n = arr.length;
        for(int r=0 ; r<n ;r++){
            int c=0;
            int minEle= (int)1e8;
            
            for(int j= 0 ; j< n;j++){
                if(arr[r][j] < minEle){
                    minEle= arr[r][j];
                    c=j;
                }
            }
            boolean isSaddlePoint = true;
            
            for(int i =0 ; i < n; i++){
                if(arr[i][c] > minEle){
                    isSaddlePoint = false;
                    break;
                }
            }
            
            if(isSaddlePoint){
                System.out.println(minEle);
                return;
            }
        }
        System.out.println("Invalid input");
    }
    public static void ExitPoint(int[][] arr,int row , int col) {
        int i = 0, j = 0, d = 0;
        input2D(arr, row , col );
        while (true) {
            d = (d + arr[i][j]) % 4 ;
            if (d == 0) { //east
                j++;
                if (j == col) {
                    System.out.println(i );
                    System.out.println(j-1);
                    break;
                }
            } else if (d == 1) { // south
                i++;
                if (i == row) {
                    System.out.println(i-1 );
                    System.out.println(j);
                    break;
                }
            } else if (d == 2) { //west
                j--;
                if (j == -1) {
                    System.out.println(i );
                    System.out.println(j+1);
                    break;
                }
            } else { // north
                i--;
                if (i == -1) {
                    System.out.println(i+1 );
                    System.out.println(j);
                    break;
                }
            }
        }
    }
public static void findEle2D(int[][] arr, int data){
    
    int i = arr.length-1 , j = 0;
    while(i >= 0 && j < arr.length){
        if ( data == arr[i][j]){
            System.out.println (i + "\n" + j);
            return;
        } else if (data > arr[i][j]){
            j++;
        } else i--;
    }
    System.out.println("Not Found");
}
public static void rotate90(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr[0].length; j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    int c0 = 0, c1 = arr.length - 1;
    while (c0 < c1) {
        for (int n = 0; n < arr.length; n++) {
            int tem = arr[n][c0];
            arr[n][c0] = arr[n][c1];
            arr[n][c1] = tem;

        }
        c0++;
        c1--;
    }
}
public static void spiral(int[][] arr) {
    int n = arr.length, m = arr[0].length, count = n * m;
    int rmin = 0, cmin = 0;
    int rmax = n - 1, cmax = m - 1;

    while (count != 0) {

        for (int r = rmin; r <= rmax && count > 0; r++) {
            System.out.println(arr[r][cmin]);
            count--;
        }
        cmin++;
        for (int c = cmin; c <= cmax && count > 0; c++) {
            System.out.println(arr[rmax][c]);
            count--;
        }
        rmax--;
        for (int r = rmax; r >= rmin && count > 0; r--) {
            System.out.println(arr[r][cmax]);
            count--;
        }
        cmax--;
        for (int c = cmax; c >= cmin && count > 0; c--) {
            System.out.println(arr[rmin][c]);
            count--;
        }
        rmin++;
    }
}