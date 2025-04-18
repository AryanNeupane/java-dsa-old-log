
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=sc.nextLine();
        System.out.println(isPalindrome(word));

        
    }
    
    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length()/2; i++) {
            int n= word.length();
            if(word.charAt(i)!=word.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
