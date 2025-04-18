
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of A and b ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);


    }
}
