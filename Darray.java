import java.util.*;

// public class Darray {
//     public static int array(int arr[],int n){
//         int large = arr[0];

//         for(int i=0; i<n; i++){
//             if(arr[i]>large){
//                 large= arr[i];
//             }
//         }
//         return large;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter the element of array:");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int large = array(arr, n);

//         System.out.println("Largest array in the element is:" + large);


//     }
    
// }


// public class Darray {
//     public static int array(int arr[],int n){
//         int large = arr[0];

//         for(int i=0; i<n; i++){
//             if(arr[i]>large){
//                 large= arr[i];
//             }
//         }
//         int slargest = -1;
//         for(int i=0; i<n; i++){
            
//             if(arr[i]> slargest && arr[i]!=large){
//                 slargest = arr[i];
//             }
//         }
//         return slargest;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter the element of array:");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int slargest = array(arr, n);

//         System.out.println("Largest array in the element is:" + slargest);


//      }


// }

// public class Darray {

//      public static int array(int arr[], int n){
//         int Largest = arr[0];
//         int slargest = -1;
//         for(int i=1; i<n; i++){
//             if(arr[i]> Largest){
//             slargest = Largest;
//             Largest = arr[i];
//             }
//         else if(arr[i]<Largest && arr[i] >slargest){
//             slargest=arr[i];
//             }
//         }
//         return slargest;
//     }
//     public static int secondSmallest(int arr[], int n) {
//     if (n < 2) {
//         return -1; // no second smallest exists
//     }

//     int smallest = arr[0];
//     int second = Integer.MAX_VALUE;

//     for (int i = 0; i < n; i++) {
//         if (arr[i] < smallest) {
//             second = smallest;
//             smallest = arr[i];
//         } else if (arr[i] > smallest && arr[i] < second) {
//             second = arr[i];
//         }
//     }

//     return smallest;
// }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of array:");
//     int n = sc.nextInt();
//     int arr[] = new int[n];

//     System.out.println("Enter the element of array:");
//     for (int i = 0; i < n; i++) {
//         arr[i] = sc.nextInt();
//     }

//     int slargest = array(arr, n);

//     System.out.println(" Second largest array in the element is:" + slargest);

//     int ssmallest = secondSmallest(arr, n);
//     System.out.println("second smallest element is:" + ssmallest);
// }
// }

// public class Darray{
//     public static boolean  sort(int arr[] , int n){
//         for(int i=1; i<n; i++){
//             if( arr[i] >= arr[i-1]){

//             }
//             else{ 
//                 return false;
//             }
//     }
//     return true;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean ans = sort(arr, n);

//         System.out.println(ans);
//     }
    
// }

// public class Darray{
//     public static int duplicate(int arr[] , int n){
//         int i = 0;
//         for (int j=1; j<n; j++){
//             if(arr[j] != arr[i]){
//                 arr[i+1] = arr[j];
//                 i++;
//             }
//         }
//         return (i+1);
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

//         int newLength = duplicate(arr, n);

//         System.out.println("Array after removing duplicates:");

//         for (int i = 0; i < newLength; i++) {
//             System.out.print(arr[i] + " ");
//         }
// }
// }



// public class Darray{
//     public static int[] rotate(int arr[] , int n){
//         int temp = arr[0];
//         for(int i=1; i<n; i++){
//             arr[i-1] = arr[i];
//         }
//         arr[n-1] = temp;
//         return arr;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the size of array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter array elements");
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         rotate(arr, n);

//         System.out.println("Array after rotate");
//         for(int i=0; i<n; i++){
//             System.out.println(arr[i] + " ");
//         }
//     }
// }


// public class Darray{
//     public static void reverse(int arr[], int start,int end){
//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static void krotate(int arr[], int n, int d){
//         if(n<=0){
//             return;
//         }
//         d= d%n;
//         if(d<0){
//             d+=n;
//         }

//         reverse(arr,0,d-1);
//         reverse(arr, d, n-1);
//         reverse(arr, 0, n-1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter rotation amount d: ");
//         int d = sc.nextInt();

//         krotate(arr, n, d);

//         System.out.println("Array after rotating by " + d + ":");
//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//         System.out.println();
//         sc.close();
//     }
// }


public class Darray {

    public static void zeroshift(int arr[], int n) {

        int j = -1;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        
        if (j == -1) {
            return;
        }

        
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
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

    zeroshift(arr, n);

    System.out.println("Array after shifting zeros to end:");
    for (int x : arr) {
        System.out.print(x + " ");
    }
    System.out.println();
    sc.close();
}
}