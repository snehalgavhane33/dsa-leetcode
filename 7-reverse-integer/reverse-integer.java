import java.util.Scanner;

class Solution {
    public static int reverse(int x){
        int revno = 0;
        while(x!= 0){
            int no = x % 10;

            if(revno>Integer.MAX_VALUE/10 || (revno==Integer.MAX_VALUE/10 && no >7)){
                return 0;
            }

            if(revno<Integer.MIN_VALUE/10 || (revno==Integer.MIN_VALUE/10 && no <-8)){
                return 0;
            }

            revno = (revno*10)+no;
            x = x/10;
        }
        return revno;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int x = sc.nextInt();
        reverse(x);
    }
}