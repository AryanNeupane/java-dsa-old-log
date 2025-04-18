
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        float r= sc.nextFloat();
        float area= 3.14f*r*r;
        System.out.println("The area of the circle is "+ area);
    }
}
