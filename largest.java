public class largest {
    public static void main(String[] args) {
        int data[]={2,4,6,8,10,12,16};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if(largest< data[i]){
                largest=data[i];
            }
            if(smallest> data[i]){
                smallest=data[i];
            }
        }
        System.out.println("Largest value "+largest);
        System.out.println("Smallest value "+smallest);
    }
}
