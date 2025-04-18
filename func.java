
import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        
        print();
        print();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two bnumberss");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("The sum is "+sum(x,y));
    }

    public static void print(){
        System.out.println("Hello this is from function");
    }
    public static int sum(int a, int b) {
        return a+b;
    }
}
