import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.printf("Digite a senha: ");
        int password = sc.nextInt();

        while (password != 2202) {
           System.out.printf("Senha invalida!");
           password = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
