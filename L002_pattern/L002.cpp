#include<iostream>
#include<conio.h>
using namespace std;
 
 void printTrianglePattern1(int row){
    int nst=1;
    for(int r = 1;r <= row; r++){
        for(int cst=1; cst <= nst; cst++){
            cout << "*\t";
        }
        nst++;
        cout<<endl;
    }
}
   void printtrianglePattern2(int row) {
    int nst = row;
    for (int r = 1; r <= row; r++) {
        for (int cst = 1; cst <= nst; cst++) {
            cout << "*\t";
        }
        nst--;
        cout << endl;
    }
}

   
void printTrianglePattern3(int row){
    int nst = 1;
    int nsp = row - 1;
    
    for (int r=1; r<= row; r++){
        for (int csp=1 ;csp <= nsp; csp++ ){
            cout<<"\t";
        }
        for (int cst=1; cst<= nst; cst++){
            cout<<"*\t";   
        }
        nst++;
        nsp--;
        cout<<endl;
    }
}

void printTrianglePattern4(int row){
    int nst = row;
    int nsp = 0;
    
    for (int r=1; r<= row; r++){
        for (int csp=1 ;csp <= nsp; csp++ ){
            cout<<"\t";
        }
        for (int cst=1; cst<= nst; cst++){
            cout<<"*\t";
            
        }
        nst--;
        nsp++;
        cout<<endl;
    }
    
}
  
    void printDiamondPattern5c(int row){
        int nst = 1;
        int nsp = row / 2;
        int val=1;
        for (int r = 1 ; r <= row ; r++){
            for ( int csp=1 ; csp <= nsp ; csp++){
                cout<<"\t";
            }
            int cval= val;
            for ( int cst=1 ; cst <= nst; cst++){
                cout<<cval<<"\t";
                if (cst <= nst/2){
                    cval++;
                }else{
                    cval --;
                }
        }
        if(r <= row / 2){
            nsp--;
            nst+=2;
            val++;
        }else{
            nsp++;
            nst-=2;
            val--;
            }
            
        cout<<endl;
    }
}
void hollowDiamondPattern6(int row){
    int nst = (row +1)/ 2;
    int nsp = 1;
    for (int r=1 ; r <= row ; r++){
        for(int cst=1 ; cst <= nst ; cst++){
            cout<< "*\t";
        }
        for (int csp=1 ; csp <= nsp ; csp++){
            cout<<"\t";
        }
        for (int cst=1 ; cst <= nst ; cst++){
            cout<< "*\t";
        }
        if(r <=  row/2){
            nst--;
            nsp+= 2;
        }
        else{
            nsp-=2;
            nst++;
        }
        cout<<endl;
    }
}
void printPattern11(int row){
    int nst=1;
    int val=1;
    for(int r = 1;r <= row; r++){
        for(int cst=1; cst <= nst; cst++){
            cout <<val<<"\t";
            val++;
        }
        nst++;
        cout<<endl;
    }
}
void printPattern12(int row){
     int a= 0;
     int b=1;
    for(int r = 1;r <= row; r++){
        for(int cst=1; cst <= r; cst++){
            cout << a <<"\t";
            int c= a+b;
            a=b;
            b=c;
        }
        cout<<endl;
    }
}
void printPattern13(int row){
         for(int n = 0 ; n < row; n++){
             int val = 1;
             for(int r = 0; r <= n; r++){
                 cout<<val<<"\t";
                 val = ((n - r) * val)/ (r + 1);
             }
             cout<<endl;
         }
     }
void printPattern14(int num){
    for (int r=1 ; r <= 10 ; r++){
        cout<<num<<" * " << r << " = "<< num*r <<endl;
    }
}
 void printPattern16(int row) {
        int nst = 1;
        int nsp = 2 * row - 3;
        for (int r = 1; r <= row; r++) {
            int val = 1;
            for (int cst = 1; cst <= nst; cst++) {
                cout<<val <<"\t";
                val++;
            }
            for (int csp = 1; csp <= nsp; csp++) {
                cout<<"\t";
            }
            if (r == row) {
                nst--;
                val--;
            }
            for (int cst = 1; cst <= nst; cst++) {
                val--;
                cout<<val <<"\t";
            } 
            nst++;
            nsp -= 2;
           cout<<endl;
        }
 }
 void printPattern17(int row) {
    int nst = 1;
    for (int r = 1; r <= row; r++) {
        for (int csp = 1; csp <= row / 2; csp++) {
            if (r == (row + 1) / 2) {
                cout << "*\t";
            } else
                cout << "\t";
        }
        for (int cst = 1; cst <= nst; cst++) {
            cout << "*\t";
        }
        if (r < (row + 1) / 2) {
            nst++;
        } else
            nst--;
        cout << endl;
    }
}
void printPattern18(int row) {
    int nst = row;
    int nsp = 0;
    for (int r = 1; r <= row; r++) {
        for (int csp = 1; csp <= nsp; csp++) {
            cout << "\t";
        }
        for (int cst = 1; cst <= nst; cst++) {
            if (r > 1 && r <= row / 2 && cst > 1 && cst < nst) {
                cout << "\t";
            } else
                cout << "*\t";
        }
        if (r <= row / 2) {
            nsp++;
            nst -= 2;
        } else {
            nsp--;
            nst += 2;
        }
        cout << endl;
    }
}
void printPattern20(int row) {
    for (int r = 1; r <= row; r++) {
        for (int c = 1; c <= row; c++) {
            {
                if (c == 1 || c == row) {
                    cout << "*\t";
                } else if (r > row / 2 && (c == r || c + r == row + 1)) {
                    cout << "*\t";
                } else cout << "\t";
            }
        }
        cout << endl;
    }
}


int main(){
    int n;
    cout<<"Enter Number: ";
    cin >> n;
    printTrianglePattern4(n);
    cout<< endl;
    hollowDiamondPattern6(n);
getch();
}