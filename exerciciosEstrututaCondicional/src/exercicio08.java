import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do seu salário: ");
        double valorSalario = sc.nextDouble();

        double valorImposto;
        if (valorSalario <= 3000.0){
            valorImposto = (valorSalario - 2000) * 0.08;
        } else if (valorSalario <= 4500.0) {
            valorImposto = (valorSalario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            valorImposto = (valorSalario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        } if (valorImposto == 0){
            System.out.println("Valor do imposto Isento! ");
        } else {
            System.out.printf("O valor do imposto é: R$ %.2f%n", valorImposto);
        }
        sc.close();

    }
}
