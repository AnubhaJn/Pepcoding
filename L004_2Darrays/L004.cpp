#include<iostream>
#include<vector>
using namespace std;
void input(vector<vector<int>> & arr){
    for (int i = 0; i < arr.size(); i++) {
        for (int j = 0; j < arr.size(); j++) {
            cin >> arr[i][j];
        }
    }
}
void disp(vector<vector<int>> & arr) {
    for (int i = 0; i < arr.size(); i++) {
        for (int j = 0; j < arr.size(); j++) {
            cout << arr[i][j]<< " ";
        }
        cout<<endl;
    }
}

void rotate90(vector<vector<int>> & arr) {
    for (int i = 0; i < arr.size(); i++) {
        for (int j = i; j < arr[0].size(); j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    int c0 = 0, c1 = arr.size() - 1;
    while (c0 < c1) {
        for (int n = 0; n < arr.size(); n++) {
            int tem = arr[n][c0];
            arr[n][c0] = arr[n][c1];
            arr[n][c1] = tem;

        }
        c0++;
        c1--;
    }
}

void spiral(vector<vector<int>> & arr) {
        int n = arr.size(), m = arr[0].size(), count = n * m;
        int rmin = 0, cmin = 0;
        int rmax = n - 1, cmax = m - 1;

        while (count != 0) {

            for (int r = rmin; r <= rmax && count > 0; r++) {
                cout<<(arr[r][cmin])<<endl;
                count--;
            }
            cmin++;
            for (int c = cmin; c <= cmax && count > 0; c++) {
                cout<<(arr[rmax][c])<<endl;
                count--;
            }
            rmax--;
            for (int r = rmax; r >= rmin && count > 0; r--) {
                cout<<(arr[r][cmax])<<endl;
                count--;
            }
            cmax--;
            for (int c = cmax; c >= cmin && count > 0; c--) {
                cout<<(arr[rmin][c])<<endl;
                count--;
            }
            rmin++;
        }
        
    }
    int main(){
    int n ,m ;
    cin >> n ;
    cin >> m;
    vector<vector<int>> arr(n, vector <int> (m,0));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> arr[i][j];
            }
        }
       spiral(arr);
    return 0;  
}