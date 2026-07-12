import java.util.Scanner;

// public class Drecursion{

//     public static void printName(int i,int n ){
//         if(i>n){
//             return ;
//         }
//         System.out.println("snehu");
//         printName(i+1,n);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a no:");
//         int n = sc.nextInt();
//         printName(1, n);

//     }
// }

// public class Drecursion{
//     public static void printNo(int i , int n){
//         if(i>n){
//             return;
//         }
//         System.out.println(i);
//         printNo(i+1, n);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a no:");
//         int n = sc.nextInt();
//         printNo(1, n);

//     }

// }

// public class Drecursion{
//     public static void printNo1(int i , int n){
//         if(i<1){
//             return;
//         }
//         System.out.println(i);
//         printNo1(i-1, n);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a no:");
//         int n = sc.nextInt();
//         printNo1(n, n);

//     }

// }



// public class Drecursion{
//     public static int sum(int n){
//         if(n==0) {
//             return 0;
//         }
//          return n+sum(n-1);
        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a no:");
//         int n = sc.nextInt();
        
//         System.out.println("sum = " + sum(n));
//     }
// }
    

// public class Drecursion{
//     public static void sum(int n , int sum){
//         if(n<0){
//             System.out.println(sum);
//             return;
//         }
//         sum(n-1,sum+n);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a no:");
//         int n = sc.nextInt();
//         sum(n, 0);

//     }
// }

//  public class Drecursion{
//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         return n* fact(n-1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a no:");
//         int n = sc.nextInt();
        
//         System.out.println("factorial  = " + fact(n));
//     }
//     }

// reverse string 1st method

// public class Drecursion{
//     public static void reverse(int i, int arr[], int n){
//         if(i>=n/2){
//             return ;
//         } 
//         int temp = arr[i];
//         arr[i]=arr[n-i-1];
//         arr[n-i-1] = temp;

//         reverse(i+1,arr,n);

//     }
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a size of array:");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("enter array element:");
//          for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//          }

//         reverse(0,arr,n);
        
//         System.out.println("reversed array:");
//          for(int i=0; i<n; i++){
//             System.out.println(arr[i] + " ");
//          }
//     }
// }


// public class Drecursion{
//     public static boolean palindrome(int i , String s){
//         if(i >= s.length()/2) {
//             return true;
//         }
//         if(s.charAt(i) != s.charAt(s.length()-i-1)){
//             return false;
//         }
//         return palindrome(i+1, s);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a string:");
//         String s = sc.next();
//         System.out.println(palindrome(0, s));
//     }
// }


public class Drecursion{
    public static int fibo(int n){
        

        if (n<=1){
            return n;
        }

        int last = fibo(n-1);
        int slast = fibo(n-2);
        return last + slast;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("enter a no:");
         int n = sc.nextInt();
         System.out.println(fibo(n));
    }
}