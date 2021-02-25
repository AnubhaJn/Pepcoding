#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

//Recursion_16SumOfDigitInString
int sumOfDigits(string str, int idx){
        if(idx == (int)str.length()) return 0;
        int recAns = sumOfDigits (str, idx+1);
        return recAns+(str[idx] - '0') ;
    }


//Recursion_17NumberToString
long stringToInt(string str, int idx, long pow ){
        if (idx == -1) return 0;
        long recAns = stringToInt(str, idx -1 , pow * 10);
        return recAns + (str[idx] - '0') * pow ; 
 }

// Recursion_18StringOneTwoAreReverse
bool checkReverse(string str1, int idx1, string str2, int idx2){
        if(idx2 == -1) return true;
        if (str1[idx1] != str2[idx2]) return false;
        return checkReverse(str1, idx1 +1, str2, idx2-1);
        
    }

// Recursion_19PalindromeOfString




int main() { 
    string str1; cin >> str1;
    string str2; cin >> str2;
        
        if ((int)str1.length() == (int)str2.length())
          cout <<boolalpha <<(checkReverse(str1 , 0, str2 , str2.length()-1 )) << endl;
        else cout<<("false");
    return 0;
    }

