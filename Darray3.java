                 //HARD PROBLEM ON ARRAY


//pascal triangle : given R & C print specific no.
import java.util.Scanner;
import java.util.*;

// public class Darray3{
//     public static long nCr(int n , int r){
//         int res = 1;
//         for(int i=0; i<r; i++){
//             res = res *(n-1);
//             res = res/(i+1);
//         }
//         return res;
//     }

//      public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter row number: ");
//         int r = sc.nextInt();
//         System.out.print("Enter column number: ");
//         int c = sc.nextInt();
//         long ans = nCr(r - 1, c - 1);
//         System.out.println("Element at (" + r + ", " + c + ") = " + ans); 
//     }
// }

//pascal triangle : print entire row
public class Darray3 {

    public static void printRow(int n){
        int ans = 1;
        System.out.println(ans + " ");
        for(int i=1; i<n; i++){
            ans = ans * (n-i);
            ans = ans/i;
            System.out.println(ans + "  ");
        }
    } 
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.print("Enter row number: ");
        int n = sc.nextInt();
        printRow(n);
}
}   