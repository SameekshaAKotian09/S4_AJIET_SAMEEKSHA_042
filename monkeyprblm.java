import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int j = input.nextInt();
        int m = input.nextInt();
        int p = input.nextInt();
        if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
        } else {
            int monkeysLeft = n - ((m / k) + (p / j));
            System.out.println("Number of monkeys Left"+monkeysLeft);
        }
    }
}
