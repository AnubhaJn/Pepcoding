public static void printPattern7(int row) {
    int nst = 1;
    int nsp = 0;
    for (int r = 1; r <= row; r++) {
        for (int cst = 1; cst <= nst; cst++) {
            System.out.print("*\t");
        }
        System.out.println("");
        for (int csp = 0; csp <= nsp; csp++) {
            System.out.print("\t");
        }
        nsp++;
    }
}
 public static void printPattern7(int row) {
    int nsp = 0;
    for (int r = 1; r <= row; r++) {
        for (int csp = 1; csp <= nsp; csp++) {
            System.out.print("\t");
        }
        System.out.println("*\t");
        nsp++;
    }
}
//better 
static void printPattern8(int row){
        int nsp= row-1;
        for (int r=1 ; r<= row ; r++){
            for(int csp=1; csp <= nsp; csp++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println("");
            nsp--;
        }
    }
public static void printPattern9(int row){
        for (int i=1 ; i<= row; i++){
            for( int j=1; j<= row; j++){
                if (i == j || i + j == row + 1){
                    System.out.print("*\t");
                }else System.out.print("\t"); 
            }
           System.out.println(""); 
        }
    }

public static void pattern10(int row) {
        int nsp1 = row / 2;
        int nsp2 = -1;
        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp1; csp++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int csp = 1; csp <= nsp2; csp++) {
                System.out.print("\t");
            }
            if (nsp2 != -1)
                System.out.print("*\t");
            if (r <= row / 2) {
                nsp1--;
                nsp2 += 2;
            } else {
                nsp2 -= 2;
                nsp1++;
            }

            System.out.println("");
        }
    }
    public static void printPattern13(int row){
         for(int n = 0 ; n < row; n++){
             int val = 1;
             for(int r = 0; r <= n; r++){
                 System.out.print(val +"\t");
                 val = ((n - r) * val)/ (r + 1);
             }
             System.out.println();
         }
         
    public static void printPattern16(int row) {
        int nst = 1;
        int nsp = 2 * row - 3;
        for (int r = 1; r <= row; r++) {
            int val = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            if (r == row) {
                nst--;
                val--;
            }

            for (int cst = 1; cst <= nst; cst++) {
                val--;
                System.out.print(val + "\t");
            }
            nst++;
            nsp -= 2;
            System.out.println("");

        }
    }
     public static void printPattern17(int row) {
    int nst = 1;
    for (int r = 1; r <= row; r++) {
        for (int csp = 1; csp <= row / 2; csp++) {
            if (r == (row + 1) / 2) {
                System.out.print("*\t");
            } else
                System.out.print("\t");
        }
        for (int cst = 1; cst <= nst; cst++) {
            System.out.print("*\t");
        }
        if (r < (row + 1) / 2) {
            nst++;
        } else
            nst--;
        System.out.println("");
    }
}
    public static void printPattern20(int row) {
    for (int r = 1; r <= row; r++) {
        for (int c = 1; c <= row; c++) {
            {
                if (c == 1 || c == row) {
                    System.out.print("*\t");
                } else if (r > row / 2 && (c == r || c + r == row + 1)) {
                    System.out.print("*\t");
                } else System.out.print("\t") ;
            }
        }
        System.out.println("");
    }