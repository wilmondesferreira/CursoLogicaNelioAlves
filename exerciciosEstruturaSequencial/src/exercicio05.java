import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double vlrUnit1, vlrUnit2, totalPagar;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        vlrUnit1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        vlrUnit2 = sc.nextDouble();

        totalPagar = (qtd1 * vlrUnit1) + (qtd2 * vlrUnit2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);

        sc.close();

    }
}
