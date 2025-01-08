import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.printf("Informe o número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("Par");
        } else {
            System.out.printf("Impar");
        }

        sc.close();
    }
}
