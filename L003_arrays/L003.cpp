 #include<iostream>
 #include<vector>
 #include<array>

 using namespace std;
 
 int maximumEle(vector<int> & arr){
        int maxEle = -1e8 ;
        for (int i= 0; i < arr.size(); i++){
            if (arr[i] > maxEle) maxEle = arr[i];
        }
        return maxEle;
    }
    
 int minimumEle(vector<int> & arr){
        int minEle = 1e8 ;
        for (int i= 0; i < arr.size(); i++){
            if (arr[i] < minEle) minEle = arr[i];
        }
        return minEle;
    }
    
 int findEle(vector<int> & arr,int data){
        int idx = -1;
        for(int i=0; i<arr.size();i++){
            if (arr[i]== data){
                idx = i;
                break;
            }
        }
        return idx;
    }

 int firstIndex(vector<int> & arr,int data){
        int idx = -1;
        for(int i=0; i<arr.size() ;i++){
            if (arr[i]== data){
                idx = i;
                break;
            }
        }
        return idx;
    }
 int lastIndex(vector<int> & arr,int data){
        int idx = -1;
        for(int i= arr.size()-1 ; i>= 0 ;i--){
            if (arr[i]== data){
                idx = i;
                break;
            }
        }
        return idx;
    }
    public static void firstIndex(int[] arr, int data) {
        int high = arr.length - 1;
        int low = 0;
        int firstidx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < arr[mid]) {
                high = mid - 1;
            } else if (data > arr[mid]) {
                low = mid + 1;
            } else {
                firstidx = mid;
                high = mid - 1;
            }
        }
         System.out.println(firstidx);
    }
// last and first index using binary search
    public static void lastIndex(int[] arr, int data) {
        int high = arr.length - 1;
        int low = 0;
        int lastidx = -1 ;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < arr[mid]) {
                high = mid - 1;
            } else if (data > arr[mid]) {
                low = mid + 1;
            } else {
                lastidx = mid;
                low = mid + 1;
            }
        }
        System.out.println(lastidx);
    }
    int reverseArr(vector<int>& arr){
    for (int i = arr.size()-1 ; i>=0; i--){
        cout << arr[i]<<" ";
    }
    
} 
// sum of two arrays
void sumOfArray(vector < int > & arr1, vector < int > & arr2, int n3) {
    vector < int > sumArr(n3);
    int c = 0;

    int i = arr1.size() - 1;
    int j = arr2.size() - 1;
    int k = sumArr.size() - 1;

    while (k >= 0) {
        int d = c;

        if (i >= 0) {
            d += arr1[i];
        }
        if (j >= 0) {
            d += arr2[j];
        }
        c = d / 10;
        d = d % 10;

        sumArr[k] = d;
        i--;
        j--;
        k--;

    }
    if (c != 0) cout << c << endl;
    for (int m = 0; m < sumArr.size(); m++) {
        cout << sumArr[m] << endl;
    }

}
void Ceil_Floor(vector<int> & arr, int data) {
        int stidx = 0;
        int endidx = arr.size() -1;
        int ceil = 0;
        int floor = 0;
        while (stidx <= endidx)  {
            int mid = (stidx + endidx) / 2;
            if (data > arr[mid] ) {
                stidx = mid + 1;
                floor = arr[mid];
            } else if (data < arr[mid]) {
                endidx = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid ];
                floor = arr[mid ];
                break;
            }
        }
        cout << ceil <<endl;
        cout << floor <<endl ;
    }
    void barchat(vector<int> & arr) {
    int max = arr[0];
    for (int i = 1; i < arr.size(); i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    for (int floor = max; floor >= 1; floor--) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr[i] >= floor) {
               cout << "*\t" ;
            } else {
               cout << "\t";
            }
        }
        cout<<endl;
    }

}
   int main(){
       int n;
       cout<<"Enter the number of elements: ";
       cin>> n;
       vector<int> arr(n);
       cout<<"Enter elements: ";
       for(int i = 0; i < n ; i++){
           cin>>arr[i] ;
       }
      cout<<"Minimum element is: "<<(arr);
   } 

