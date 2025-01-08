import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorN = sc.nextInt();
        int fat = 1;

        for (int i = 1; i <= valorN ; i++) {
            fat = fat * i;
        }
        System.out.println(fat);

        sc.close();
    }
}
