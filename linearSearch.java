
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int data[]={2,4,6,8,10,12,16};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int key=sc.nextInt();
        System.out.println(linearSearchF(data, key));
    
    }
    public static int linearSearchF(int data[],int key) {
        for (int i = 0; i < data.length; i++) {
            if(data[i]==key){
                return i;
            }
        }
        return -1;
    }
}
