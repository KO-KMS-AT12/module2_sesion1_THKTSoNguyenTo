import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so bat ki: ");
        int n = scanner.nextInt();
        if (check(n)) {
            System.out.println("So " + n + " la so nguyen to");
        } else {
            System.out.println("So " + n + " khong la so nguyen to");
        }

    }

    static boolean check(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
