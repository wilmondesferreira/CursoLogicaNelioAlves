import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberTestCase = sc.nextInt();

        for (int i = 0; i < numberTestCase; i++) {

            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double mediaNota = ((nota1 * 2 + nota2 * 3 +nota3 * 5) / 10);

            System.out.printf("%.1f%n", mediaNota);
        }


        sc.close();
    }
}
