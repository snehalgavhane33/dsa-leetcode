import java.util.*;

public class BSonANS {
    public static int findSquareRoot(int n){
        int low = 1;
        int high = n;
        int ans = 1;
        while(low<=high){
            int mid = (low + high)/2;
            if((mid*mid)<=n){
                ans = mid;
                low = mid + 1;

            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements in the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Square root of " + n + " = " + findSquareRoot(n));
    }
}
