#include <iostream>

#include <vector>

using namespace std;

void input(vector < int > & arr) {
    for (int i = 0; i < arr.size(); i++) {
        cin >> arr[i];
    }
}

void print(vector < int > & arr) {
    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << endl;
    }
    cout << endl;
}

// used for swapping ith and jth elements of array
void swap(vector < int > & arr, int i, int j) {
    cout << ("Swapping index " + to_string(i) + " and index " + to_string(j)) << endl;
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void sort012(vector < int > & arr) {
    int n = arr.size();
    int ptr1 = 0;
    int ptr2 = n-1;
    int itr = 0;
    while (itr <= ptr2) {
        if (arr[itr] == 0)
            swap(arr, itr++, ptr1++);
        else if (arr[itr] == 2)
            swap(arr, itr  , ptr2--);
        else itr++;
    }
}

int main() {
    int n, m;
    cin >> n;
    vector < int > A(n, 0);
    input(A);

    sort012(A);
    print(A);
    return 0;
}