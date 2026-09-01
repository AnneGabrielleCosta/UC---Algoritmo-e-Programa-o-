import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ITALIAN);

        System.out.print("Digite o valor do produto: ");
        double valorOriginal = scanner.nextDouble();

        double desconto = valorOriginal * 0.10;
        double valorComDesconto = valorOriginal - desconto;

        System.out.println("O preço com 10% de desconto é: " + valorComDesconto);

        scanner.close();
    }
}