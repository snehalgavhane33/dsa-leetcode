package DSA;
import java.util.*;

// public class DBS2Darray{
//     public static int lowerBound(int arr[] , int n, int target){
//         int low = 0;
//         int high = n-1;
//         int ans = n;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]>=target){
//                 ans=mid;
//                 high = mid-1;
//             }else{
//                 low = mid+1;

//             }
//         }
//         return ans;
//     }
    
//     public static int rowWithMinimumOne2(int arr[][], int n, int m){
//         int cnt_max = 0;
//         int index = -1;
//         for(int i=0; i<n; i++){
//             int cnt_ones = m- lowerBound(arr[i], m, i);
//             if(cnt_ones > cnt_max){
//                 cnt_max=cnt_ones;
//                 index = i;
//             }
//         }
//         return index;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int n = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int m = sc.nextInt();
//         int arr[][] = new int[n][m];
//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//          System.out.println("Row with maximum number of 1s: " + rowWithMinimumOne2(arr, n, m));
//          sc.close();
//     }
// }

//Q2.Search in a 2D Matrix(better)
// public class DBS2Darray{
//     public static boolean findTarget1(int n, int m, int arr[][], int target){
//         int i=0;
//         int j=m-1;
//         while(i<n && j>=0){
//             if(arr[i][j] == target){
//                 return true;
//             }
//             if(arr[i][j] > target){
//                 j--;
//             }else{
//                 i++;
//             }
//         }
//         return false;
//     }

//      public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int n = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int m = sc.nextInt();
//         int arr[][] = new int[n][m];
//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.print("Enter target: ");
//         int target = sc.nextInt();
        
//         System.out.println("Target found: " + findTarget1(n, m, arr, target));
//     }
// }

//Q2.Search in a 2D Matrix(better)
public class DBS2Darray{
     public static boolean findTarget2(int n, int m, int arr[][], int target){
        if(arr.length == 0) return false;

        int low =0;
        int high = n*m -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid/m][mid%m]==target){
                return true;
            }
            if(arr[mid/m][mid%m]<target){
                low= mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        System.out.println("Target found: " + findTarget2(n, m, arr, target));
    }

}