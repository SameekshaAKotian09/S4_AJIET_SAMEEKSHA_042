public class Main{
 public static void main(String[] args) {
        int[] arr = {17,8,25,2};
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element = " + largest);
    }
}
