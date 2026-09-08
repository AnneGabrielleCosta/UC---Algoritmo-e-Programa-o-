import java.util.Scanner;

public class ExercicioEmissorNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 a 40): ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double precoUnitario = 0;

        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.00;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.00;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.00;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Código de produto inválido!");
            scanner.close();
            return;
        }

        double precoTotal = precoUnitario * quantidade;
        double percentualDesconto = 0;

        if (precoTotal <= 250.00) {
            percentualDesconto = 0.05;
        } else if (precoTotal <= 500.00) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double valorDesconto = precoTotal * percentualDesconto;
        double precoFinal = precoTotal - valorDesconto;

        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Preço total da nota: R$ %.2f\n", precoTotal);
        System.out.printf("Valor do desconto (%.0f%%): R$ %.2f\n", percentualDesconto * 100, valorDesconto);
        System.out.printf("Preço final da nota: R$ %.2f\n", precoFinal);

        scanner.close();
    }
}