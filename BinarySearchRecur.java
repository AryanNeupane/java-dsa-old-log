public class BinarySearchRecur {

        public static int binarySearch(int[] arr, int left, int right, int key) {
            if (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (arr[mid] == key) {
                    return mid;
                }
    
                if (arr[mid] > key) {
                    return binarySearch(arr, left, mid - 1, key);
                }
    
                return binarySearch(arr, mid + 1, right, key);
            }
            return -1;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 10, 40};
            int key = 10;
            int result = binarySearch(arr, 0, arr.length - 1, key);
            if (result == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    
    
}
