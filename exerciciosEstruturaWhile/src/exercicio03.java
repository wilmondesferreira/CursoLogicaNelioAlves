import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[1] - Alcool | [2] - Gasolina | [3] - Diesel | [4] - Fim");
        System.out.printf("Informe uma das opções acima: ");

        int tipoCombustivel = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipoCombustivel != 4){
            if(tipoCombustivel == 1){
                alcool = alcool + 1;
            } else if (tipoCombustivel == 2) {
                gasolina = gasolina +1;
            } else if (tipoCombustivel == 3) {
                diesel = diesel + 1;
            }

            tipoCombustivel = sc.nextInt();

            }

        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel : " + diesel);

        sc.close();
        }

    }
