import java.util.Scanner;
import java.util.*;

// public class Dhash{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter size of array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("enter" + n + "array element:");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int[] hash = new int[13];
//         for(int i=0; i<n; i++){
//             hash[arr[i]]++;
//         }

//         System.out.println("enter no of query:");
//         int q = sc.nextInt();
//         while(q-- > 0){
//             System.out.println("enter no to find query");
            
//             int no = sc.nextInt();
//             System.out.println("frequency:"+hash[no]);
//         }
//     }
// }

// public class Dhash{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string :");
//         String s = sc.next();

//         int[] hash = new int[256];//for capital or small letter, take 26, for both take 256

//         for(int i=0; i<s.length(); i++){
//             hash[s.charAt(i)]++;//for capital letter its hash[s.charAt(i) - 'A']++ and for small letter its hash[s.charAt(i) - 'a']++
//         }

//         System.out.println("Enter no of query");
//         int q = sc.nextInt();

//         while(q-- > 0){
//             System.out.println("Enter character of count:");
//             char c = sc.next().charAt(0);

//             System.out.println("Frequency of " + c + "=" + hash[c]);
//         }
//     }
// }

