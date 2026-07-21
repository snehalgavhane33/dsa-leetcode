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

public class Darray2{
    public static void sort012(int[] arr, int n){
        int low = 0; 
        int mid =0; 
        int high = n-1;
        
        while (mid <= high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort012(arr, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}