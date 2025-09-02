import java.util.Scanner;
import java.math.BigInteger;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn heiltal for n: ");

        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("n må vere > 0.");
        }

            if (n <= 20) {
                long res = 1L;
                for (int i = 2; i <= n; i++) {
                    res *= i;
            }
            System.out.println(n + "! = " + res);
            } else {
             
                BigInteger res = BigInteger.ONE;
                for (int i = 2; i <= n; i++) {
                    res = res.multiply(BigInteger.valueOf(i));
                }
                System.out.println(n + "! = " + res);
        }

        scanner.close();
    }
}
