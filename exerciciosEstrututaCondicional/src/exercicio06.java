import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.printf("Informe o valor do intervalo: ");

        double valorIntervalo = sc.nextDouble();

        if(valorIntervalo < 0 || valorIntervalo > 100) {
            System.out.println("Fora do Intervalo");
        } else if (valorIntervalo <= 25) {
            System.out.println("Intervalo[0,25]");
        } else if (valorIntervalo <= 50) {
            System.out.println("Intervalo[25,50]");
        } else if (valorIntervalo <= 75) {
            System.out.println("Intervalo[50,75]");
        } else {
            System.out.println("Intervalo[75,100]");
        }


        sc.close();
    }
}
