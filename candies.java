import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int N=10;
        int k=5;
        int candies=N;
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        if (order<=candies-k) {
            candies=candies-order;
            System.out.println("NUMBER OF CANDIES SOLD:"+order);
             System.out.println("NUMBER OF CANDIES AVAILABLE:"+candies);
        } else {
             System.out.println("INVALID INPUT");
        }
    }
}
