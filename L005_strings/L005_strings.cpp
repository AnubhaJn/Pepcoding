#include<iostream>
 using namespace std;
 void substring(string str){
    int i = 0 ,j= 0;
    for (i=0 ; i <= str.length()-1 ;i++){
        for (j = 1; j+i <= str.length() ; j++){
            cout<< str.substr(i,j) << endl;
        }
    }
}
 string compression1(string str) {
        // write your code here
        if (str.length() <= 1) return str;
        string s= "";

        int i = 0;
        while (i < str.length()) {
            s += str[i];
            int count = 1;
            while (i < str.length() - 1 && str[i + 1] == str[i]) {
                count++;
                i++;
            }
            
            i++;
        }


        return s;
    }

    string compression2(string str) {
        // write your code here
        if (str.length() <= 1) return str;
        string s= "";
        int i = 0;
        while (i < str.length()) {
            s += str[i];
            int count = 1;
            while (i < str.length() - 1 && str[i + 1] == str[i]) {
                count++;
                i++;
            }

            if (count > 1) s += to_string (count);
            i++;
        }


        return s;
    }
     string toggleCase(string str) {
        //write your code here
      
        for(int i=0; i < str.length(); i++){
            if(str[i]>= 'A' && str[i] <= 'Z'){
                str[i] =(str[i] - 'A' +'a');
            }else if (str[i] >= 'a' && str[i] <= 'z'){
                str[i]= (str[i] +'A' -'a');
            }
        }
        return str;
 }

 // reverse string2 541 LeetCode
 void reverseRange(string &s , int i, int j){
        while(i<j){
            swap (s[i++], s[j--]);
        }
    }
    
    string reverseStr(string s, int k) {
        if ( k == 0|| k == 1 || s.length() <= 1) return s;
        
        int i = 0 , n = s.length();
        while(i< n){
            if(i + k -1 < n){
                reverseRange(s , i , i+k-1);
                i += 2*k ;
            }else { 
                reverseRange(s , i , n-1);
                break;
                  }
            }
        return s;
        }
// LeetCode 387. First Unique Character in a String
     int firstUniqChar(string s) {
         vector<int> freq(26,0);
        for (int i =0; i <s.length();i++){
            freq[s[i]- 'a']++;
        }
        for (int i =0 ; i<s.length() ; i++){
            if (freq[s[i]- 'a'] == 1) return i;
        }
        return -1;
    }
    int main() {
        string str ; cin >> str;
        cout << compression1(str)<< endl;
        cout<<compression2(str)<<endl;
        return 0;
    }
