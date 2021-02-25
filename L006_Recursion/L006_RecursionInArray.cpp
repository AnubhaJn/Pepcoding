#include <iostream>
#include<vector> 
using namespace std;

// display array
void display(vector<int> &arr, int idx){
    // write your code here
    if (idx == arr.size()) return ;
    cout << arr[idx]<<endl;
     display(arr,idx +1);
    
}

//display array in reverse
void display(vector<int> &arr, int idx){
    // write your code here
    if (idx == arr.size()) return ;
    
     display(arr,idx +1);
     cout << arr[idx]<<endl;
}

// maximum of array
int maxOfArray(vector<int> &arr, int idx){
    // write your code here
    if (idx == arr.size()) return -1e9;
    int maxOfSmallSeg =  maxOfArray(arr,idx +1);
    return  max(arr[idx], maxOfSmallSeg);
    
}

//first  index in the array
int firstIndex(vector<int> &arr, int idx, int data){
    // write your code here
    if(idx  == arr.size()) return -1;
    if (arr[idx] == data) return idx;
    return firstIndex(arr, idx+1 , data);
}

//last  index in the array
int lastIndex(vector<int> &arr, int idx, int data){
    // write your code here
    if(idx < 0 ) return -1;
    if (arr[idx] == data) return idx;
    return lastIndex(arr, idx-1 , data);
}


// taking input in the array
void input(vector<int> & arr){
    for (int i = 0; i < arr.size(); i++)
        cin >> arr[i];
}

// main function 
int main(){
    int n; cin >> n;
    vector<int> arr(n,0);
    input(arr);
    cout << maxOfArray(arr, 0);
    return 0;
}
