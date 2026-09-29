import java.util.Scanner;

class nomeAlunoLista4Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] faturamento = new double[5];
        String[] diasDaSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};

        double totalAcumulado = 0;

        for (int i = 0; i < faturamento.length; i++) {
            System.out.print("Digite o valor total de vendas de " + diasDaSemana[i] + " (R$): ");
            faturamento[i] = scanner.nextDouble();
            totalAcumulado += faturamento[i];
        }

        double mediaDiaria = totalAcumulado / faturamento.length;

        System.out.println("\n--- RELATÓRIO DE VENDAS ---");
        System.out.printf("Faturamento total acumulado: R$ %.2f\n", totalAcumulado);
        System.out.printf("Média diária de vendas: R$ %.2f\n", mediaDiaria);

        System.out.println("\nDias que ficaram abaixo da média diária:");
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] < mediaDiaria) {
                System.out.printf("Dia %d (%s) ficou abaixo da média com R$ %.2f\n", (i + 1), diasDaSemana[i], faturamento[i]);
            }
        }

        scanner.close();
    }
}