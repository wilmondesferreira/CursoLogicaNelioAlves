import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area,pi = 3.14159;

        double raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
