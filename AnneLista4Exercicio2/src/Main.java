import java.util.Scanner;

class nomeAlunoLista4Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaSalarios = 0;
        int somaFilhos = 0;
        int totalHabitantes = 0;
        double maiorSalario = 0;
        int contadorAteUmSalarioMinimo = 0;

        // Considerando o salário mínimo atual como referência (ex: R$ 1.412,00 ou ajuste conforme necessário)
        final double SALARIO_MINIMO = 1412.00;

        char continuar;

        do {
            System.out.print("Digite o salário do habitante (R$): ");
            double salario = scanner.nextDouble();

            System.out.print("Digite o número de filhos: ");
            int filhos = scanner.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            totalHabitantes++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= SALARIO_MINIMO) {
                contadorAteUmSalarioMinimo++;
            }

            System.out.print("Deseja continuar cadastrando? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        if (totalHabitantes > 0) {
            double mediaSalario = somaSalarios / totalHabitantes;
            double mediaFilhos = (double) somaFilhos / totalHabitantes;
            double percentualSalarioMinimo = ((double) contadorAteUmSalarioMinimo / totalHabitantes) * 100;

            System.out.println("\n--- RESULTADOS DA PESQUISA ---");
            System.out.printf("a) Média do salário da população: R$ %.2f\n", mediaSalario);
            System.out.printf("b) Média do número de filhos: %.2f\n", mediaFilhos);
            System.out.printf("c) Maior salário: R$ %.2f\n", maiorSalario);
            System.out.printf("d) Percentual com salário de até 1 salário mínimo: %.2f%%\n", percentualSalarioMinimo);
        } else {
            System.out.println("Nenhum dado foi registrado.");
        }

        scanner.close();
    }
}