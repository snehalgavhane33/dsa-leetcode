import java.util.*;

//Q1.Search X in sorted array(iterative code)
// public class BSon1D{
//     public static int binarySearch(int arr[], int n, int target){
//         int low=0;
//         int high = n-1;
//         while(low<=high){
//             int mid = low+high/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             else if(target>arr[mid]){
//                 low = mid +1;
//             }else{
//                 high=mid-1;

//             }
//         }
//         return -1;
//     }
    
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the target element: ");
//         int target= sc.nextInt();

//          int result = binarySearch(arr, n, target);
//         if (result != -1) {
//             System.out.println("Element found at index: " + result);
//         } else {
//             System.out.println("Element not found.");
//         }
//     }
// }

//Q1.Search X in sorted array(recursive code)
// public class BSon1D {

//     public static int bs(int arr[], int low , int high, int target){
//         if(low> high) return -1;

//          int mid = (low+high)/2;

//          if(arr[mid]==target) return mid;
//          else if(target>arr[mid]){
//             return bs(arr, mid+1, high, target);
//          }

//          return bs(arr, low, mid - 1, target);
//     }

//     public static int binarySearch(int arr[], int n, int target){
//         return bs(arr, 0, n-1, target);
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

//         System.out.print("Enter the target element: ");
//         int target= sc.nextInt();

//          int result = binarySearch(arr, n, target);
//         if (result != -1) {
//             System.out.println("Element found at index: " + result);
//         } else {
//             System.out.println("Element not found.");
//         }
//     }

// }


//Q2 lower bound
// public class BSon1D {

//     public static int lowerBound(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         int ans = n;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]>=target){
//                 ans=mid;
//                 high = mid-1;
//             }
//             else{
//                 low = mid +1;
//             }
//         }
//         return ans;
//     }

//             public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the target element: ");
//         int target= sc.nextInt();

//         int ans = lowerBound(arr, n, target);
//         if (ans == n) {
//             System.out.println("Lower Bound does not exist.");
//         } else {
//             System.out.println("Lower Bound Index: " + ans);
//             System.out.println("Lower Bound Element: " + arr[ans]);
//         }
//     }
// }

//Q3 upper bound
// public class BSon1D {
//     public static int upperBound(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         int ans = n;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]>target){
//                 ans=mid;
//                 high = mid-1;
//             }
//             else{
//                 low = mid +1;
//             }
//         }
//         return ans;
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

//         System.out.print("Enter the target element: ");
//         int target= sc.nextInt();

//         int ans = upperBound(arr, n, target);
//         if (ans == n) {
//             System.out.println("Upper Bound does not exist.");
//         } else {
//             System.out.println("Upper Bound Index: " + ans);
//             System.out.println("Upper Bound Element: " + arr[ans]);
//         }
//     }
// }


//Q4.Search insert position(same as lower bound)
// public class BSon1D {

//     public static int insertPosition(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         int ans = n;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]>=target){
//                 ans = mid;
//                 high = mid -1;

//             }
//             else{
//                 low = mid + 1;
//             }
//         }
//         return ans;

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

//         System.out.print("Enter the target element: ");
//         int target= sc.nextInt();

//         int ans = insertPosition(arr, n, target);
//         System.out.println("Insert Position: " +insertPosition(arr, n, target));
//     }
// }


//Q5.Floor and Ceil in Sorted Array
// Floor: Greatest element <= target
// public class BSon1D {

//     public static int floor(int arr[], int n , int target){
//         int low = 0;
//         int high = n-1;
//         int ans = -1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]<=target){
//                 ans =mid;
//                 low = mid +1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }

//      // Ceil: Smallest element >= target(lower bound)
//     public static int ceil(int arr[], int n, int target) {
//         int low = 0, high = n - 1;
//         int ans = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] >= target) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the target element: ");
//         int target= sc.nextInt();

//          //Floor
//         int floorIndex = floor(arr, n, target);
//         if (floorIndex == -1)
//             System.out.println("Floor does not exist.");
//         else {
//             System.out.println("Floor Index: " + floorIndex);
//             System.out.println("Floor Element: " + arr[floorIndex]);
//         }
//         //Ceil
//         int ceilIndex = ceil(arr, n, target);
//         if (ceilIndex == -1)
//             System.out.println("Ceil does not exist.");
//         else {
//             System.out.println("Ceil Index: " + ceilIndex);
//             System.out.println("Ceil Element: " + arr[ceilIndex]);
//         }
//     }
// }


//Q6.First and last occurrence(code 1)
// public class BSon1D {

//     // Lower Bound:
//     // First index where arr[index] >= target
//     public static int lowerBound(int arr[], int n, int target) {

//         int low = 0;
//         int high = n - 1;
//         int ans = n;

//         while (low <= high) {

//             int mid = (low + high) / 2;

//             if (arr[mid] >= target) {
//                 ans = mid;
//                 high = mid - 1;
//             } 
//             else {
//                 low = mid + 1;
//             }
//         }

//         return ans;
//     }
//     // Upper Bound:
//     // First index where arr[index] > target
//     public static int upperBound(int arr[], int n, int target) {

//         int low = 0;
//         int high = n - 1;
//         int ans = n;

//         while (low <= high) {

//             int mid = (low + high) / 2;

//             if (arr[mid] > target) {
//                 ans = mid;
//                 high = mid - 1;
//             } 
//             else {
//                 low = mid + 1;
//             }
//         }

//         return ans;
//     }


//     // Find first and last occurrence
//     public static int[] firstAndLastPosition(int arr[], int n, int target) {

//         // Find first occurrence
//         int lb = lowerBound(arr, n, target);

//         // Target does not exist
//         if (lb == n || arr[lb] != target) {
//             return new int[]{-1, -1};
//         }

//         // Find last occurrence
//         int ub = upperBound(arr, n, target);

//         return new int[]{lb, ub - 1};
//     }


//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter sorted array elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter target element: ");
//         int target = sc.nextInt();

//         int ans[] = firstAndLastPosition(arr, n, target);

//         System.out.println("First Occurrence = " + ans[0]);
//         System.out.println("Last Occurrence = " + ans[1]);

//         sc.close();
//     }
// }

//Q6.First and last occurrence(code 2)
// public class BSon1D{
//     public static int firstOccurance(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         int first = -1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]==target){
//                 first = mid;
//                 high=mid-1;
//             }
//             else if(arr[mid]<target){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         return first;
//     }

//     public static int lastOccurance(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         int last = -1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]==target){
//                 last = mid;
//                 low=mid+1;
//             }
//             else if(arr[mid]<target){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         return last;
//     }

//     public static int[] firstAndLastPosition(int arr[], int n, int target){
//         int first = firstOccurance(arr, n, target);
//         if(first==-1){
//             return new int[]{-1,-1};
//         }
//         int last = lastOccurance(arr, n, target);
//         return new int[]{first,last};
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

//         System.out.print("Enter target element: ");
//          int target = sc.nextInt();

//         int[] result = firstAndLastPosition(arr, n, target);
//         System.out.println("First occurrence: " + result[0]);
//         System.out.println("Last occurrence: " + result[1]);

//     }
// }


//Q7.Count Occurrences in a Sorted Array
// public class BSon1D {

//     public static int firstOccurance(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         int first = -1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]==target){
//                 first = mid;
//                 high=mid-1;
//             }
//             else if(arr[mid]<target){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         return first;
//     }

//     public static int lastOccurance(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         int last = -1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]==target){
//                 last = mid;
//                 low=mid+1;
//             }
//             else if(arr[mid]<target){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         return last;
//     }
    
//     public static int count(int arr[], int n , int target){
//         int first = firstOccurance(arr, n, target);
//         if(first==-1){
//             return 0;
//         }

//         int last = lastOccurance(arr, n, target);
//         return last - first + 1;
//     }


//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter sorted array elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter target element: ");
//         int target = sc.nextInt();

//         int ans = count(arr, n, target);

//         System.out.println("Number of occurrences = " + ans);

//         sc.close();
//     }
// }


//Q8.Search in rotated sorted array-I
// public class BSon1D {

//     public static int rotateSearch(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//                 if(arr[low]<=arr[mid]){
//                     if(arr[low]<=target && target<arr[mid]){
//                         high=mid-1;

//                     }
//                     else{
//                         low=mid+1;
//                     }
//                 }
//                 else{
//                     if(arr[mid]<target && target<=arr[high]){
//                         low=mid+1;
//                     }
//                     else{
//                         high = mid - 1;

//                     }
//                 }
//         }
//         return -1;
//     }

    
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter rotated sorted array:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter target: ");
//         int target = sc.nextInt();

//         int ans = rotateSearch(arr, n, target);

//         if (ans == -1) {
//             System.out.println("Target not found");
//         }
//         else {
//             System.out.println("Target found at index: " + ans);
//         }

//         sc.close();
//     }
// }

//Q9.Search in rotated sorted array-II
// public class BSon1D {

//     public static int rotateSearch(int arr[], int n, int target){
//         int low = 0;
//         int high = n-1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             if(arr[low]==arr[mid] && arr[mid]==arr[high]){
//                 low = low + 1;
//                 high = high - 1;
//                 continue;
//             }
            
//             if(arr[low]<=arr[mid]){
//                 if(arr[low]<=target && target<arr[mid]){
//                     high=mid-1;

//                 }
//                 else{
//                     low=mid+1;
//                 }
//             }
//             else{
//                 if(arr[mid]<target && target<=arr[high]){
//                     low=mid+1;
//                 }
//                 else{
//                     high = mid - 1;

//                 }
//             }
//         }
//         return -1;
//     }

    
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter rotated sorted array:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter target: ");
//         int target = sc.nextInt();

//         int ans = rotateSearch(arr, n, target);

//         if (ans == -1) {
//             System.out.println("Target not found");
//         }
//         else {
//             System.out.println("Target found at index: " + ans);
//         }

//         sc.close();
//     }
// }


//Q10.Find minimum in Rotated Sorted Array
// public class BSon1D{
//     public static int findMin(int arr[], int n){
//         int low = 0;
//         int high = n-1;
//         int ans= Integer.MAX_VALUE;
//         while(low<=high){
//             int mid = (low + high)/2;
//             if(arr[low]<=arr[high]){
//                 ans = Math.min(ans,arr[low]);
//                 break;
//              }

//             if(arr[low]<=arr[mid]){
//                 ans = Math.min(ans,arr[low]);
//                 low = mid + 1;
                
//             }
//             else{
//                 ans = Math.min(ans,arr[mid]);
//                 high = mid - 1;

//             }
//         }
//         return ans;

//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter rotated sorted array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int ans = findMin(arr, n);

//         System.out.println("Minimum element = " + ans);

//         sc.close();
//     }
// }


//Q11.Find out how many times the array is rotated
public class BSon1D{
    public static int findRotationCount(int arr[], int n){
        int low = 0;
        int high = n-1;
        int index = -1;
        int ans= Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    index = low;
                    ans = arr[low];
                }
                low = mid + 1;
                
            }
            else{
                if(arr[mid]<ans){
                    index=mid;
                    ans =arr[mid];
                }
                high = mid - 1;

            }
        }
        return index;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        

        System.out.println("Array rotated " + findRotationCount(arr, n) +" times." );

        sc.close();
    }
}