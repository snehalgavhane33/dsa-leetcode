import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age : ");
        int Age = sc.nextInt();
        System.out.println(Age);

        System.out.println("Input your name : ");
        String name = sc.next();
        System.out.println(name);

        System.out.println("enter description");
        String name1 = sc.nextLine();
        System.out.println(name1);
    }
}
