import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ITALIAN);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;

        System.out.println("O dobro de " + numero + " é " + dobro);

        scanner.close();
    }
}