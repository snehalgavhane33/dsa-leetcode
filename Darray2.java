import java.util.*;

// public class Darray2 {
//     public static int[] twoSum(int[] nums, int target) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {

//             int num = nums[i];
//             int moreNeeded = target - num;

//             if (map.containsKey(moreNeeded)) {
//                 return new int[]{map.get(moreNeeded), i};
//             }

//             map.put(num, i);
//         }

//         return new int[]{-1, -1};
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] nums = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         System.out.print("Enter target: ");
//         int target = sc.nextInt();

//         int[] result = twoSum(nums, target);

//         System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

//         sc.close();
//     }
// }


// better solution for sorted arrays by 012 order
// public class Darray2{
//     public static void sort012(int[] arr, int n){
//         int cnt0 = 0;
//         int cnt1 = 0;
//         int cnt2 = 0;;
//         for(int i=0; i<n; i++){
//             if(arr[i] == 0){
//                 cnt0++;
//             }
//             else if(arr[i] == 1){
//                 cnt1++;
//             }
//             else{
//                 cnt2++;
//             }
//         }

//         for(int i=0; i<cnt0; i++){
//             arr[i] = 0;
//         }

//          for (int i = cnt0; i < cnt0 + cnt1; i++) {
//             arr[i] = 1;
//         }

        
//         for (int i = cnt0 + cnt1; i < n; i++) {
//             arr[i] = 2;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements (only 0, 1, 2):");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         sort012(arr, n);

//         System.out.println("Sorted Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }

//         sc.close();
//     }
// }


//optimal solution for 012
// public class Darray2{
//     public static void sort012(int[] arr, int n){
//         int low = 0; 
//         int mid =0; 
//         int high = n-1;
        
//         while (mid <= high){
//             if(arr[mid]==0){
//                 int temp = arr[low];
//                 arr[low] = arr[mid];
//                 arr[mid] = temp;
//                 low++;
//                 mid++;
//             }
//             else if(arr[mid] == 1){
//                 mid++;
//             }
//             else{
//                 int temp = arr[mid];
//                 arr[mid]=arr[high];
//                 arr[high]=temp;
//                 high--;
//             }
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements (only 0, 1, 2):");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         sort012(arr, n);

//         System.out.println("Sorted Array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }

// majority element appears more than N/2 times better 
// public class Darray2{
//     public static int majorityElement(int[] arr, int n){
//         HashMap <Integer , Integer> map = new HashMap<>();
    
//         for(int i=0; i<n; i++){
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }

//         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             if(entry.getValue()>n/2){
//                 return entry.getKey();
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int ans = majorityElement(arr, n);

//         System.out.println("Majority Element = " + ans);

//         sc.close();
//     }
// }


// majority element appears more than N/2 times optimal
// public class Darray2{
//     public static int majorityElement(int[] arr, int n){
//         int cnt=0;
//         int el = 0;
//         for(int i=0; i<n; i++){
//             if(cnt==0){
//                 cnt=1;
//                 el=arr[i];
//             }
//             else if(arr[i]==el){
//                 cnt++;
//             }
//             else{
//                 cnt--;
//             }
//         }

//         int cnt1 =0;
//         for(int i=0; i<n; i++){
//             if(arr[i]==el) cnt1++;
//         }
//         if(cnt1 > n/2){
//             return el;
//         }
//         return -1;
//     }

//         public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int ans = majorityElement(arr, n);

//         System.out.println("Majority Element = " + ans);

//         sc.close();
//     }
// }

//kadane's algorithm maximum subarray sum solution better approach
// public class Darray2{
//     public static int maxSubArray(int[] arr, int n){
//         int maxi = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             int sum = 0;
//             for(int j=i; j<n; j++){
//                 sum += arr[j];
//                 maxi =Math.max(maxi , sum);
//             }
//         }
//         return maxi;
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int ans = maxSubArray(arr, n);

//         System.out.println("Maximum Subarray Sum = " + ans);

//         sc.close();
//     }
// }

// kadane's algorithm maximum subarray sum solution optimal1 approach
// public class Darray2{
//     public static int maxSubArray(int[] nums){
//         int sum =0;
//         int maxi = Integer.MIN_VALUE;
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//              sum += nums[i];
//             if(sum>maxi){
//                 maxi=sum;
//             }
//             if(sum<0){
//                 sum=0;
//             }
//         }
//         return maxi;
//     }
//     public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter size of array: ");
//     int n = sc.nextInt();

//     int[] nums = new int[n];

//     System.out.println("Enter array elements:");
//     for (int i = 0; i < n; i++) {
//         nums[i] = sc.nextInt();
//     }

//     int ans = maxSubArray(nums);

//     System.out.println("Maximum Subarray Sum = " + ans);

//     sc.close();
// }
//}

// kadane's algorithm maximum subarray sum solution optimal2 approach

// public class Darray2 {

//     public static int maxSubArray(int[] arr , int n){
//         int sum=0;
//         int maxi = Integer.MIN_VALUE;
//         int start = 0;
//         int ansStart = -1;
//         int ansEnd = -1;

//         for(int i=0; i<n; i++){
//             if(sum==0){
//                 start = i;
//             }

//             sum += arr[i];

//             if(sum>maxi){
//                 maxi =sum;
//                 ansStart = start;
//                 ansEnd = i;
//             }
//             if(sum<0){
//                 sum=0;
//             }
//         }
//         System.out.print("Maximum Subarray:");
//         for(int i= ansStart; i<=ansEnd; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         return maxi;
//     }
//     public static void main(String[] args) {
 
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter size of array: ");
//     int n = sc.nextInt();

//     int[] arr = new int[n];

//     System.out.println("Enter array elements:");
//     for (int i = 0; i < n; i++) {
//         arr[i] = sc.nextInt();
//     }

//     int ans = maxSubArray(arr,n);

//     System.out.println("Maximum Subarray Sum = " + ans);

//     sc.close();
// }
// }


//Buy and sell stock 
// public class Darray2 {

//     public static int maxProfit(int[] arr){
//         int n = arr.length;
//         int mini = arr[0];
//         int maxprofit = 0;

//         for(int i=0; i<n; i++){
//             int profit = arr[i] - mini;
//             maxprofit = Math.max(maxprofit,profit);
//             mini = Math.min(mini, arr[i]);

//         }
//         return maxprofit;

//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of days: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter stock prices:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int ans = maxProfit(arr);

//         System.out.println("Maximum Profit = " + ans);

//         sc.close();
//     }
// }


// rearrange array by sign

// public class Darray2 {

//     public static int[] rearrangeArray(int[] arr){
//         int n = arr.length;
//         int[] ans = new int[n];
//         int posIndex = 0;
//         int negIndex = 1;

//         for(int i=0; i<n; i++){
//             if(arr[i]<0){
//                 ans[negIndex] = arr[i];
//                 negIndex += 2;
//             }
//             else{
//                 ans[posIndex] = arr[i];
//                 posIndex += 2;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int[] result = rearrangeArray(arr);

//         System.out.println("Rearranged Array:");

//         for (int x : result) {
//             System.out.print(x + " ");
//         }

//         sc.close();
//     }
// }

// rearrange by sign 2

// public class Darray2 {

//     public  static int[] rearrangeArray(int[] arr){
//         int n = arr.length;
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();

//         for(int i=0; i<n; i++){
//             if(arr[i]>0){
//                 pos.add(arr[i]);
//             }
//             else{
//                 neg.add(arr[i]);
//             }
//         }

//         if(pos.size() > neg.size()){
//             for(int i=0; i< neg,size(); i++){
//                 arr[2*i] = pos.get(i);
//                 arr[2*i+1] = neg.get(i);
//             }

//             int index = pos.size() * 2;
//               for (int i = pos.size(); i < neg.size(); i++) {
//                 arr[index] = neg.get(i);                 
//                 index++;
//               }
//         }
//         return arr;
//     }
// }



// next permutation find
// public class Darray2 {

//     public static void nextPermutation(int[] arr){
//         int n = arr.length;
//         int ind = -1;

//         for(int i=n-2; i>=0; i--){
//             if(arr[i]< arr[i+1]){
//                 ind = i;
//                 break;
//             }
//         }
//         if(ind==-1){
//             reverse(arr,0,n-1);
//             return;
//         }

//         for(int i=n-1; i> ind; i--){
//             if(arr[i]>arr[ind]){
//                 int temp = arr[i];
//                 arr[i]=arr[ind];
//                 arr[ind]=temp;

//                 break;
//             }
//         }
//         reverse(arr, ind + 1, n - 1);
//     }

//      public static void reverse(int[] arr, int start, int end) {

//         while (start < end) {

//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         nextPermutation(arr);

//         System.out.println("Next Permutation:");

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }

//         sc.close();
//     }
// }

// public class Darray2 {

//     public static ArrayList<Integer> leaders(int[] arr , int n){
//         ArrayList<Integer> ans = new ArrayList<>();
//         int maxi = Integer.MIN_VALUE;

//         for(int i=n-1; i>=0; i--){
//             if(arr[i]> maxi){
//                 ans.add(arr[i]);
//             }
//             maxi=Math.max(maxi,arr[i]);
//         }
//         Collections.reverse(ans);
//         return ans;
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         ArrayList<Integer> result = leaders(arr, n);

//         System.out.println("Leader Elements:");

//         for (int x : result) {
//             System.out.print(x + " ");
//         }

//         sc.close();
//     }
// }

// public class Darray2 {

//     public static int longestSuccessiveEle(int[] arr, int n){
//         if(n==0){
//             return 0;
//         }
//         Arrays.sort(arr);
//         int lastSmaller = Integer.MIN_VALUE;
//         int cnt = 0;
//         int longest = 1;
//         for(int i=0; i<n;i++){
//             if(arr[i] - 1== lastSmaller){
//                 cnt++;
//                 lastSmaller=arr[i];
//             }
//             else if(arr[i]==lastSmaller){
//                 continue;
//             }
//             else{
//                 cnt = 1;
//                 lastSmaller=arr[i];
//             }
//              longest = Math.max(longest, cnt);
//         }
//         return longest;
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int ans = longestSuccessiveEle(arr, n);

//         System.out.println("Longest Consecutive Sequence Length = " + ans);

//         sc.close();
//     }
// }


// Longest Consecutive Sequence in an Array(Better)
// public class Darray2 {

//     public static int longestSuccessiveEle(int[] arr, int n){
//         Arrays.sort(arr);
//         int lastSmaller=Integer.MIN_VALUE;
//         int cnt = 0;
//         int longest = 1;
//         for(int i=0; i<n; i++){
//             if(arr[i]-1 == lastSmaller){
//                 cnt++;
//                 lastSmaller=arr[i];

//             }
//             else if(lastSmaller!= arr[i]){
//                 cnt = 1;
//                 lastSmaller= arr[i];
//             }
//             longest=Math.max(longest,cnt);

            
//         }
//         return longest;

//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int ans = longestSuccessiveEle(arr, n);

//         System.out.println("Longest Consecutive Sequence Length = " + ans);

//         sc.close();
//     }
// }


//Longest Consecutive Sequence in an Array(optimal)
// public class Darray2{
//     public static int longestSuccessiveEle(int[] arr, int n){
//     HashSet <Integer> st = new HashSet<>();
//     int longest = 1;
//     for(int i=0;i<n;i++){
//         st.add(arr[i]);
//     }
//     for(int it : st){
//         int cnt = 1;
//         int x = it;
//         while(st.contains(x+1)){
//             x=x+1;
//             cnt++;
//         }
//         longest = Math.max(longest,cnt);

//     }
//     return longest;
// }

// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
         
//         int result = longestSuccessiveEle(arr, n);
//         System.out.println("Longest consecutive sequence length = " + result);
//     }


// }


//set matrix zeros (better)
// public class Darray2{
//     public static int[][] matrixZeros(int arr[][], int n, int m){
//         int[] row = new int[n];
//         int[] col = new int[m];

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(arr[i][j] == 0){
//                     row[i]=1;
//                     col[j]=1;

//                 }
//             }
//         }

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(row[i]==1 || col[j]==1){
//                     arr[i][j]=0;
//                 }
//             }
//         }
//         return arr;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter rows: ");
//         int n = sc.nextInt();

//         System.out.print("Enter columns: ");
//         int m = sc.nextInt();

//         int[][] arr = new int[n][m];
//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         int[][] result = matrixZeros(arr, n, m);

//         System.out.println("Result matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }


//set matrix zeros (optimal)
// public class Darray2 {

//     public static int[][] matrixZeros(int arr[][] ,  int n, int m){
//         int col0 = 1;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(arr[i][j] == 0){
//                     arr[i][0]=0;
//                     if(j!=0){
//                         arr[0][j]=0;
//                     }else{
//                         col0=0;
//                     }
//                 }
//             }
//         }
//         for(int i=1;i<n;i++){
//             for(int j=1;j<m;j++ ){
//                 if(arr[i][0] == 0 || arr[0][j] == 0 ){
//                     arr[i][j] = 0;

//                 }
//             }
//         }
//         if (arr[0][0] == 0) {
//             for (int j = 0; j < m; j++) {
//                 arr[0][j] = 0;
//             }
//         }

//         if (col0 == 0) {
//             for (int i = 0; i < n; i++) {
//                 arr[i][0] = 0;
//             }
//         }
//         return arr;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter rows: ");
//         int n = sc.nextInt();

//         System.out.print("Enter columns: ");
//         int m = sc.nextInt();

//         int[][] arr = new int[n][m];
//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         int[][] result = matrixZeros(arr, n, m);

//         System.out.println("Result matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }



//Rotate matrix by 90 degree 
// public class Darray2{
//     public static void rotateMatrix(int[][] mat, int n){
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 int temp = mat[i][j];
//                 mat[i][j]=mat[j][i];
//                 mat[j][i]=temp;
//             }
//         }
//         for(int i=0;i<n;i++){
//             int left = 0;
//             int right = n-1;
//             while(left<right){
//                 int temp = mat[i][left];
//                 mat[i][left]=mat[i][right];
//                 mat[i][right]=temp;
//                 left++;
//                 right--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter matrix size n: ");
//     int n = sc.nextInt();

//     int[][] mat = new int[n][n];
//     System.out.println("Enter matrix elements row by row:");
//     for (int i = 0; i < n; i++) {
//         for (int j = 0; j < n; j++) {
//             mat[i][j] = sc.nextInt();
//         }
//     }

//     rotateMatrix(mat, n);

//     System.out.println("Rotated matrix:");
//     for (int i = 0; i < n; i++) {
//         for (int j = 0; j < n; j++) {
//             System.out.print(mat[i][j] + " ");
//         }
//         System.out.println();
//     }

//     sc.close();
// }
// }


//spiral matrix
// public class Darray2 {

//     public static List<Integer> spiralMatrix(int arr[][] , int n, int m){
//         List<Integer> ans = new ArrayList<>();
//         int left = 0;
//         int right= m-1;
//         int top =0;
//         int bottom=n-1;
//         while(top<=bottom && left<=right){
//             for(int i=left;i<=right; i++){
//                 ans.add(arr[top][i]);
//             }
//             top++;
//             for(int i=top; i<=bottom;i++){
//                 ans.add(arr[i][right]);
//             }
//             right--;
//             if(top<=bottom){
//                 for(int i=right; i>=left; i--){
//                     ans.add(arr[bottom][i]);
//                 }
//                 bottom--;
//             }
//             if(left<=right){
//                 for(int i=bottom; i>=top; i--){
//                     ans.add(arr[i][left]);
//                 }
//                 left++;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of rows");
//         int n = sc.nextInt();

//         System.out.println("Enter number of columns");
//         int m = sc.nextInt();

//         int[][] arr = new int[n][m];

//         System.out.println("Enter matrix element:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         List<Integer> result = spiralMatrix(arr, n, m);

//         System.out.println("Spiral Order:");

//         for (int num : result) {
//             System.out.print(num + " ");
//         }

//         sc.close();
//     }

//     }


//count subarray sum equals to k(better)
// public class Darray2 {

//     public static int subarray(int arr[], int n, int k){
//         int cnt=0;
//         for(int i=0;i<n;i++){
//             int sum =0;

//             for(int j=i; j<n; j++){
//                 sum += arr[j];
//                 if(sum==k){
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for(int i =0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter value of k");
//         int k = sc.nextInt();

//         int ans = subarray(arr, n, k);
//         System.out.println("Number of arrays with sum " + k + "=" + ans);

// }
// }

//count subarray sum equals to k(optimal)
public class Darray2 {
    public static int subarray(int arr[] , int n, int k){
        HashMap <Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum=0;
        int cnt=0;
        for(int i=0; i<n; i++){
            preSum += arr[i];
            int remove  = preSum - k;
            cnt += map.getOrDefault(remove,0);
            map.put(preSum,map.getOrDefault(preSum,0 ) + 1);

    }
    return cnt;

    }
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        System.out.println("Number of subarrays with sum " + k + " = " + subarray(arr, n, k));
     }
}