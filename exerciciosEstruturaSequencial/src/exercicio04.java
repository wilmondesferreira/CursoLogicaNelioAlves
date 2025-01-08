import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o número do funcionário: ");
        int employeeNumber = sc.nextInt();
        System.out.printf("Informe o a quantidade de horas trabalhadas: ");
        int hoursWorked = sc.nextInt();
        System.out.printf("Informe o valor por horas trabalhadas: ");
        Double hourlyRate = sc.nextDouble();

        double salary = hoursWorked * hourlyRate;

        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", salary);


        sc.close();
    }
}
