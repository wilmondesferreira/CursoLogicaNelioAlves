import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informa o valor de X: ");
        int x = sc.nextInt();
        System.out.print("Informa o valor de Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro");
            } else if (y > 0 && x < 0) {
                System.out.println("Segundo");
            } else if (y < 0 && x < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            x = sc.nextInt();
            y= sc.nextInt();

        }

        sc.close();
    }
}
