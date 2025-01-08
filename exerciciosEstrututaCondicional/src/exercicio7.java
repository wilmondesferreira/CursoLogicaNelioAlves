import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de X: ");
        double valorCoordenadaX = sc.nextDouble();
        System.out.print("Informe o valor de Y: ");
        double valorCoordenadaY = sc.nextDouble();

        if (valorCoordenadaX == 0 && valorCoordenadaY ==0){
            System.out.println("Você está na origem");
        } else if (valorCoordenadaX == 0) {
            System.out.println("Você está na no Eixo Y");
        } else if (valorCoordenadaY == 0) {
            System.out.println("Você está no Eixo X");
        } else if (valorCoordenadaX > 0 && valorCoordenadaY > 0) {
            System.out.println("Você está no Q1");            
        } else if (valorCoordenadaX < 0 && valorCoordenadaY > 0) {
            System.out.println("Você está no Q2");
        } else if (valorCoordenadaX < 0 && valorCoordenadaY < 0) {
            System.out.println("Você está no Q3");
        } else {
            System.out.println("Você está no Q4");
        }
        sc.close();
    }
}
