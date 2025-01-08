import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

            int quadrado = (int) Math.pow(i,2);
            int cubo = (int) Math.pow(i,3);

            System.out.printf(i + "" + quadrado + "" + cubo);

        }


        sc.close();
    }
}
