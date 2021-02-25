#include <iostream>

#include <vector>

using namespace std;
void input(vector < int > & arr) {
    for (int i = 0; i < arr.size(); i++) {
        cin >> arr[i];
    }
}

void swap(vector < int > & arr, int i, int j) {
    cout << ("Swapping " + to_string(arr[i]) + " and " + to_string(arr[j])) << endl;
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void sort01(vector < int > & arr, int m) {
    int n = arr.size();
    int itr = 0;
    int ptr = 0;
    while (itr < n) {
        if (arr[itr] <= m)
            swap(arr, itr++, ptr++);
            
        else itr++;
    }
}

void print(vector < int > & arr) {
    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << " ";
    }
    
}

int main() {
    int n, pivot;
    cin >> n;
    vector < int > A(n, 0);
    input(A);
    cin >> pivot;
    

    sort01(A,pivot);
    print(A);
    return 0;

}