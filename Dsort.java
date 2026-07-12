// public class Dsort {
//     public static void main(String[] args) {
//         int arr[] = { 13,46,24,52,20,9};
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             int mini = i;
//             for(int j=i+1; j<n; j++){
//                 if (arr[j]<arr[mini]){
//                     mini=j;
//                 }
//             }
//             int temp = arr[mini];
//             arr[mini]=arr[i];
//             arr[i]=temp;
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;

// public class Dsort {

//     public static void selection(int arr[], int n) {
//         for(int i=0; i<n-1; i++){
//             int mini= i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[mini]){
//                     mini=j;
//                 }
//             }
//             int temp = arr[mini];
//              arr[mini]=arr[i];
//              arr[i]=temp;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
         
//         System.out.print("Enter the unsorted array:");
//         for(int i=0; i<n ; i++){
//             arr[i]=sc.nextInt();
//         }

//         selection(arr,n);

//         System.out.print("Enter the sorted array:");
//         for(int i=0; i<n ; i++){
//             System.out.print(arr[i]+" ");
//         }


//     }
// }

//import java.util.Scanner;

// public class Dsort {

//     public static void bubble(int arr[],int n){
//         for(int i=n-1; i>=0; i--){
//             for(int j=0;j<=i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter the unsorted array:");
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }

//         bubble(arr,n);

//         System.out.print("sorted array:");
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;
// public class Dsort{

//     public static void insertion(int arr[], int n){
//         for(int i=0; i<=n-1; i++){
//             int j=i;
            
//             while(j>0 && arr[j-1]>arr[j]){
//                 int temp = arr[j];
//                 arr[j] = arr[j-1];
//                 arr[j-1]=temp;

//                 j--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter the unsorted array:");
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }

//         insertion(arr,n);

//         System.out.print("sorted array:");
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.*;

// public class Dsort{
//     public static void merge(int arr[], int low ,int mid, int high ){
//         ArrayList<Integer> temp = new ArrayList<>();
//         int left = low;
//         int right = mid+1;
//         while(left <= mid && right <= high){
//             if(arr[left]<=arr[right]){
//                 temp.add(arr[left]);
//                 left++;
//             }
//             else{
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }
//         while(left<=mid){
//             temp.add(arr[left]);
//             left++;

//         }
//         while(right<=high){
//             temp.add(arr[right]);
//             right++;
//         }
//         for(int i=low; i<= high; i++){
//             arr[i] = temp.get(i-low);
//         }
//     }
//     public static void mergeSort(int arr[], int low, int high) {
//         if (low >= high) {
//             return; // Base case: single element
//         }

//         int mid = (low + high) / 2;

//         mergeSort(arr, low, mid);       // Left half
//         mergeSort(arr, mid + 1, high);  // Right half

//         merge(arr, low, mid, high);     // Merge both halves
//     }

//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of array:");
//         int n = sc.nextInt();
//         int[] arr= new int[n];

//         System.out.println("Enter array elements:");
//         for(int i =0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }

//         mergeSort(arr,0,n-1);

//         System.out.println("Sorted array elements:");
//         for(int i =0; i<n; i++){
//             System.out.println(arr[i] + " ");
//         }
//     }
// }

import java.util.*;

public class Dsort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low]; // First element as pivot
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot && i < high) {
                i++;
            }

            while (arr[j] > pivot && j > low) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);

            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}