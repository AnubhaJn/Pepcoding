 #include<iostream>
 using namespace std;

 void printHello(){
     cout<<"Hi There!"<<endl;
     cout<<"This is Anubha";
 }
 void workWithDataType(){
     int a=50;
     int b=20;
     cout<<"Value of A:"+ to_string(a) <<endl;
     cout<<"Value of B:"+ to_string(b) <<endl;
 }

void gradingSystem(int n){
      if (n>90){
          cout<<"excellent"<<endl;
      }
      else if(n>80 && n<=90){
          cout<<"good"<<endl;
      }
      else if(n>70 && n<=80){
          cout<<"fair"<<endl;
      }
      else if(n>60 && n<=70){
          cout<<"meets expectations"<<endl;
      }
      else{
         cout<<"below par"<<endl;
      }
  }

   bool isPrime_(int n){
      bool prime= true;
      for(int i= 2; i*i < n ; i++){
       if(n % i == 0){
           prime  = false;
           break;
       }
      }
      return prime;
  }

  void isPrime(){
     int n;
     cin >> n;
     bool ans= isPrime_(n);

     if(ans) cout<<"prime"<<endl;
     else cout<< "not prime"<<endl;
  }

  void printAllPrime(int a, int b){
      for (int i=a, i<=b ; i++){
          bool ans = isPrime_(i);
          if(ans) cout << i <<endl;
      }
  }
  void printFibo(int n){
      
      int a=0,b=1;
      for (int i=1; i<= n;i++)
      { cout<<a<<""<<endl;
        int sum = a+b;
        a=b;
        b=sum;
      }
     }  
int countDigits(int n){
    int count = 0;
    int num= n;
    while (num != 0 ){
        num = num / 10;
        count++;
    }
   return count;
}

 int rotateNumber(int n, int r){
     int len= countDigits(n);
     r %= len;
     if (r<0) r = (r + len) % len;
     
     int mul = 1, div = 1;
     for (int i  = 1; i<= len; i++){
         if (i<= r) div *=10;
         else mul *= 10;
     }
     int A = n % div;
     int B = n / div;
     
     return A * mul +B;

 }
  void Digits(int n) {
        int num = n;
        int len = countDigits(num);

        int div = 1;
        while (len-- > 1) {
            div *= 10;
        }
        while (div != 0) {
            cout<<""<<(n / div)<<endl;
            n = n % div;
            div /= 10;

        }
 }
 void lcm(int a, int b) {
    int max =0 ;
     max = (a > b) ? a : b;
    do {
        if (max % a == 0 && max % b == 0) {
            cout << "" << max << endl;
            break;
        } else
            ++max;
    } while (true);
}

void gcd(int a, int b){
    while(a % b != 0){
       int remainder = a % b;
       a = b ;
       b = remainder;
    }
    cout <<""<< b << endl;
}
void benjaminBulbs(int n){
       for (int i= 1; i*i <n ; i++){
           cout << i*i << endl;
       }
   }


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

     void printDiamondPattern5(int row){
        int nst = 1;
        int nsp = row / 2;
        for (int r = 1 ; r <= row ; r++){
            for ( int csp=1 ; csp <= nsp ; csp++){
                cout<<"\t";
            }
            for ( int cst=1 ; cst <= nst; cst++){
                cout<<"*\t";
        }
        if(r <= row / 2){
            nsp--;
            nst+=2;
        }else{
            nsp++;
            nst-=2;
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
 int main(){
     //printHello();
     //workWithDataType();
     //FOR EVEN ODD
     int n ;
     cin >> n;
     noEvenOrOdd(n);
     //FOR PRIME
     int t;
     cin>>t;
     while (t-- >0){
         isPrime();
     }
    // FOR PRINTING PRIME BETWEEN NUMBERS
     int low,high;
     cin >> low >> high;
     printAllPrime(low,high);
     return 0;
     int n;
    cin >> n;
    printFibo(n);
 }