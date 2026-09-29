import java.util.Scanner;

class EstatisticasDoacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade total de doações recebidas no dia: ");
        int qtdDoacoes = scanner.nextInt();

        if (qtdDoacoes > 0) {
            double total = 0;
            double maior = 0;
            double menor = 0;

            for (int i = 1; i <= qtdDoacoes; i++) {
                System.out.print("Digite o valor da doação " + i + " (R$): ");
                double valor = scanner.nextDouble();

                total += valor;

                if (i == 1) {
                    maior = valor;
                    menor = valor;
                } else {
                    if (valor > maior) {
                        maior = valor;
                    }
                    if (valor < menor) {
                        menor = valor;
                    }
                }
            }

            System.out.println("\n--- RELATÓRIO DE DOAÇÕES ---");
            System.out.printf("Valor total arrecadado: R$ %.2f\n", total);
            System.out.printf("Maior valor individual doado: R$ %.2f\n", maior);
            System.out.printf("Menor valor individual doado: R$ %.2f\n", menor);
        } else {
            System.out.println("A quantidade de doações deve ser maior que zero.");
        }
        scanner.close();
    }
}