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
public class BSon1D {

    public static int bs(int arr[], int low , int high, int target){
        if(low> high) return -1;

         int mid = (low+high)/2;

         if(arr[mid]==target) return mid;
         else if(target>arr[mid]){
            return bs(arr, mid+1, high, target);
         }

         return bs(arr, low, mid - 1, target);
    }

    public static int binarySearch(int arr[], int n, int target){
        return bs(arr, 0, n-1, target);
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target= sc.nextInt();

         int result = binarySearch(arr, n, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

}