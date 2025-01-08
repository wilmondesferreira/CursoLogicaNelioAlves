import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o número a ser lido: ");
        int numero = sc.nextInt();

        if (numero < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
