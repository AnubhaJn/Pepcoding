#include<iostream>
#include<vector>

using namespace std;

//---Print Maze Paths---
//return type
// sr - source row
// sc - source column
// dr - destination row
// dc - destination column
vector < string > getMazePaths(int sr, int sc, int dr, int dc) {
    if (sr == dr && sc == dc) {
        vector < string > base;
        base.push_back("");
        return base;
    }
    vector < string > myAns;
    if (sc + 1 <= dc) {
        vector < string > Horizontal = getMazePaths(sr, sc + 1, dr, dc);
        for (string s: Horizontal) {
            myAns.push_back("h" + s);
        }
    }
    if (sr + 1 <= dr) {
        vector < string > Vertical = getMazePaths(sr + 1, sc, dr, dc);
        for (string s: Vertical) {
            myAns.push_back("v" + s);
        }
    }
    return myAns;
}
void display(vector<string> & arr){
    cout << "[";
    for(int i = 0; i < arr.size() ; i++){
        cout << arr[i];
        if (i < arr.size()- 1) cout<< ", ";
    }
    cout << "]" << endl;
}

//way up
void printMazePaths(int sr, int sc, int dr, int dc, string ans){
    // write your code here
        if (sr == dr && sc == dc) {
            cout << ans << endl;
            return;
        }
        if (sc + 1 <= dc)
            printMazePaths(sr, sc + 1, dr, dc, ans + 'h');
        if (sr + 1 <= dr)
            printMazePaths(sr + 1, sc, dr, dc, ans + 'v');
    }
// ---Print Stair Paths----
//with wayup
void printStairPaths(int n, string path){
    if (n == 0) {
        cout<<(path)<<endl;
        return;
    } else if (n < 0) return;


    printStairPaths(n - 1, path + "1" );
    printStairPaths(n - 2, path + "2");
    printStairPaths(n - 3, path + "3");
    
}

int main() {
    int n, m;
    cin >> n >> m;
    vector < string > ans = getMazePaths(0, 0, n - 1, m - 1);
    display(ans);

    return 0;
}