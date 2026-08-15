import java.util.*;

//Q1.Find square root of a number
// public class BSonANS {
//     public static int findSquareRoot(int n){
//         int low = 1;
//         int high = n;
//         int ans = 1;
//         while(low<=high){
//             int mid = (low + high)/2;
//             if((mid*mid)<=n){
//                 ans = mid;
//                 low = mid + 1;

//             }else{
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.print("Enter the elements in the array: ");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Square root of " + n + " = " + findSquareRoot(n));
//     }
// }


//Q2.Find Nth root of a number
public class BSonANS{
    public static double multiply(double number,int n){
        double ans = 1.0;
        for(int i=1; i<=n; i++){
            ans = ans * number;
        }
        return ans;
    }
    public static void getNthRoot(int n, int m){
        double low = 1;
        double high = m;
        double eps = 1e-6;
        while((high-low)>eps){
            double mid = (low+high)/2.0;
            if(multiply(mid,n)<m){
                low = mid ;
            }
            else{
                high = mid;
            }

        }
        System.out.println(low + " " + high);

        // Verification using Java's built-in Math.pow
        System.out.println(Math.pow(m, 1.0 / n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter n no.:");
        int n = sc.nextInt();
        System.out.println("enter m no.");
        int m = sc.nextInt();
        
        getNthRoot(n, m);
        
        sc.close();
    }
    

}