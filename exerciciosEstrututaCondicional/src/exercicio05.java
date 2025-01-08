import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoItem = sc.nextInt();
        int quantidadeItem = sc.nextInt();

        double valorAPagar;

        if (codigoItem == 1){
            valorAPagar = quantidadeItem * 4.00;
        } else if (codigoItem == 2) {
            valorAPagar = quantidadeItem * 4.50;
        } else if (codigoItem == 3) {
            valorAPagar = quantidadeItem * 5.00;
        } else if (codigoItem == 4){
            valorAPagar = quantidadeItem * 2.00;
        } else {
            valorAPagar =quantidadeItem * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", valorAPagar);
        sc.close();

    }
}
