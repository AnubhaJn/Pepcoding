#include <iostream>

#include <vector>

using namespace std;
void input(vector < int > & arr) {
    for (int i = 0; i < arr.size(); i++) {
        cin >> arr[i];
    }
}

 int binarySearch(vector<int> &arr , int data , int si, int ei){
     while(si <= ei){
         int mid = (si + ei) / 2;
         if(mid == data) return mid;
         else if(mid < data) si = mid + 1;
         else ei = mid -1;
     }
     return -1;
 }

int main() {
    int n ;
    cin >> n;
    vector < int > A(n, 0);
    input(A);
    int data ;
    cin >> data;
    cout << binarySearch(A , data , 0 , n-1);
    return 0;

}