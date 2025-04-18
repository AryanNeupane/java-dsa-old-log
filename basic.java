
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("Enter a number");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("The sum of the numbers is "+sum);

    }
}