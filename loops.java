import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Input a number");
            number = sc.nextInt();
            System.out.print("here is your number");
            System.out.println(number);

        }while(number >=0);

        System.out.println("end");
    }
}
