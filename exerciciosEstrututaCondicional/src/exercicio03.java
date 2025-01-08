import java.util.Scanner;

public class exercicio03 {


    /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente.*/



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os valores de A e B: ");
        int valorA = sc.nextInt();
        int valorB = sc.nextInt();

        if (valorA % valorB == 0 || valorB % valorA == 0){
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não São Multiplos");
        }

        sc.close();
    }
}
