#include <iostream>
using namespace std;

//decreasing
 void printDecreasing(int n){
    // write your code here
    if(n==0) return;
        cout<<n<<endl;
        printDecreasing(n-1);
}

 //increasing
void printIncreasing(int n){
    // write your code here
    if (n == 0) return;
        printIncreasing( n-1);
        cout <<(n)<<endl;
    
}
 
 //increasingdecreasing
void printIncDec(int n){
    // write your code here
    if (n == 0) return;
        cout<< (n) << endl;
         printIncDec( n-1);
        cout<< (n) << endl;

}

//factorial 
int factorial(int n){
    // write your code here
        if(n==1) return 1;
        int fact = n * factorial(n-1);
        return fact;
    
}

// power by algebraic
int power(int x,int n){
        if (n==0) return 1;
        int num = power(x,n-1) * x;
        return num;
}

//power by log (x^n/2 * x^n/2)
int powerLogarithmic(int x,int n){
    // write your code here
        if (n == 0 ) return 1;
        int ans =  powerLogarithmic(x,n/2) ;
        ans *= ans;
        if ( n% 2 == 1) ans *= x;
        return ans;
}

//printing pre, in, post zigzag
void pzz(int n){
    if(n==0){
         return ;
     }
     cout << n << " ";
     pzz(n-1);
     cout <<n << " ";
     pzz(n-1);
     cout <<n << " ";
    }
    
    
// main function 
int main(){
    int x; 
    cout<< "Enter the number :"
    cin >> x;
    int n;
    cout<< "Enter the power of the number :"
    cin >> n;
    cout << powerLogarithmic(x,n);
    return 0;
}
