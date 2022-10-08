import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int i = scanner.nextInt();

        if (i > 0) {
            long summand = 1;

            summand <<= i;

            long sum = summand;

            for (int j = 0; j < 8 - i; j++) {
                summand += sum << 1;
                sum <<= 1;
            }

            System.out.println(A - (A & summand));
//            System.out.println(A & summand);
        }
        else {
            System.out.println(A);
        }
    }
}