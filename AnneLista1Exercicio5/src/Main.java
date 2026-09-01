import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ITALIAN);

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC calculado é: " + imc);

        scanner.close();
    }
}