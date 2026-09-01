import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ITALIAN);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite a porcentagem de aumento (%): ");
        double porcentagemAumento = scanner.nextDouble();

        double valorAumento = salarioAtual * (porcentagemAumento / 100);
        double novoSalario = salarioAtual + valorAumento;

        System.out.println("O valor do aumento é: R$ " + valorAumento);
        System.out.println("O novo salário final é: R$ " + novoSalario);

        scanner.close();
    }
}
