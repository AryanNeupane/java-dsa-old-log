public class TwoDArrayExample {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Display the elements of the 2D array
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
 