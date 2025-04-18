public class prime {
    public static void main(String[] args) {
        // System.out.println(isPrime(5));
        printPrime(30);
    }

    public static boolean isPrime(int n){
        if(n==2){
           return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int n){
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
