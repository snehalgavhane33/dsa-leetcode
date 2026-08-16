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
// public class BSonANS{
//     public static double multiply(double number,int n){
//         double ans = 1.0;
//         for(int i=1; i<=n; i++){
//             ans = ans * number;
//         }
//         return ans;
//     }
//     public static void getNthRoot(int n, int m){
//         double low = 1;
//         double high = m;
//         double eps = 1e-6;
//         while((high-low)>eps){
//             double mid = (low+high)/2.0;
//             if(multiply(mid,n)<m){
//                 low = mid ;
//             }
//             else{
//                 high = mid;
//             }

//         }
//         System.out.println(low + " " + high);

//         // Verification using Java's built-in Math.pow
//         System.out.println(Math.pow(m, 1.0 / n));
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("enter n no.:");
//         int n = sc.nextInt();
//         System.out.println("enter m no.");
//         int m = sc.nextInt();
        
//         getNthRoot(n, m);
        
//         sc.close();
//     }
    

// }

//koko eating bananas
// public class BSonANS {
//     public static int findMax(int[] v) {
//         int maxi = Integer.MIN_VALUE;
//         int n = v.length;
//         for (int i = 0; i < n; i++) {
//             maxi = Math.max(maxi, v[i]);
//         }
//         return maxi;
//     }
//     //Q3 function 2
//     public static int calculateTotalHours(int[] v, int hourly) {
//         int totalH = 0;
//         for (int i = 0; i < v.length; i++) {
//             totalH += Math.ceil((double) v[i] / hourly);
//         }
//         return totalH;
//     }
//     //Q3 function 3
//     public static int minEatingSpeed(int[] piles, int h) {
//         int low = 1;
//         int high = findMax(piles);
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int totalH = calculateTotalHours(piles, mid);
//             if (totalH <= h) {
//                 high = mid - 1;
//             } 
//             else {
//                 low = mid + 1;
//             }
//         }
//         return low;
//     }

//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of piles: ");
//         int n = sc.nextInt();
//         int[] piles = new int[n];
//         System.out.println("Enter bananas in each pile:");
//         for (int i = 0; i < n; i++) {
//             piles[i] = sc.nextInt();
//         }
//         System.out.print("Enter maximum hours: ");
//         int h = sc.nextInt();
//         System.out.println("Minimum eating speed = " + minEatingSpeed(piles, h));
//         }
//     }


//Q4.Minimum days to make M bouquets
public class BSonANS{
 public static boolean possible(int arr[], int days, int m, int k, int n){
        int cnt =0;
        int noOfB=0;
        for(int i=0; i<n;i++){
            if(arr[i]<=days){
                cnt++;
            }else{
                noOfB += (cnt/k);
                cnt=0;
            }
        }
        noOfB+=(cnt/k);
        return noOfB>=m;
    }
    //Q4 function 2
    public static int roseGarden(int arr[], int r, int b, int n){
        long val = (long) r * b;
        if(val>n) return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        int low = mini;
        int high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(arr, mid, b, r,n)) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements in the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
             System.out.print("Enter flowers per bouquet: ");
        int r = sc.nextInt();
        System.out.print("Enter number of bouquets: ");
        int b = sc.nextInt();
        System.out.println("Minimum days required = " + roseGarden(arr, r, b, n));

        }
    }
}

