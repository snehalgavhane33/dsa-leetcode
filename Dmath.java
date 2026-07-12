import java.util.Scanner;
/*//Given an integer N, return the number of digits in N

public class Dmath {
    public static void digit(int n) {
        int cnt = 0;
        
        while( n > 0){
            int lastdigit = n%10;
            cnt = cnt+1;
            n= n/10;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no:");
        int n = sc.nextInt();
        digit(n);
    }
}*/

/*//You are given an integer n. Return the integer formed by placing the digits of n in reverse order. 

public class Dmath {

    public static void reverse(int n){
        int revno = 0;
        while(n>0){
            int no = n % 10;
            revno = (revno*10) +no;
            n = n/10;
        }
        System.out.print(revno);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no:");
        int n = sc.nextInt();
        reverse(n);


}
}*/

// public class Dmath{
//     public static void palindrome(int n){
//         int revno = 0;
//         int dup = n;
        
//         while(n>0){
//             int no = n%10;
//             revno = (revno*10) + no;
//             n = n/10;
//         }
//         if(dup==revno){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not Palindrome");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter no:");
//         int n = sc.nextInt();
//         palindrome(n);
//     }
// }

// public class Dmath{
//     public static void gcd(int a, int b){
//         while(a>0 && b>0){
//             if(a>b){
//                 a = a%b;
//             }
//             else{
//                 b=b%a;
//             }
//         }
//         if(a==0){
//             System.out.println(b);
//         }
//         else{
//             System.out.println(a);
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no1:");
//         int a = sc.nextInt();
//         System.out.print("Enter no2:");
//         int b = sc.nextInt();
//         gcd(a,b);
//     }
// }

// public class Dmath{
//     public static void armstrong(int n){
//         int dup = n;
//         int sum = 0;
//         while(n>0){
//             int no = n%10;
//             sum = sum + (no*no*no);
//             n = n/10;

//         }
//         if(dup == sum){
//             System.out.println("Armstrong");
//         }
//         else{
//             System.out.println("Not Armstrong");
//         }
//     }
// }

// public class Dmath {

//     public static void divisors(int n){
//         for(int i=1; i<=n; i++){
//             if(n%i==0){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a no:");
//         int n = sc.nextInt();
//         divisors(n);
//     }
// }

public class Dmath {
    public static void prime(int n){
        int cnt = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                cnt++;
                if(n/i != i){
                    cnt++;
                }
            }
        }
        if(cnt==2){
            System.out.println("prime no");
        }else{
            System.out.println("not prime no");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a no:");
         int n = sc.nextInt();
         prime(n);
    }
}