public class numPalinREcur {
    
        public static void main(String[] args) {
            int num = 121, original = num, reversed = 0;
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            System.out.println(original == reversed ? "Palindrome" : "Not Palindrome");
        }
    
    
    
}
