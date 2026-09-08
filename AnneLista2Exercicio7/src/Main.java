import java.util.Scanner;

public class ExercicioFinanciamento {
    public ExercicioFinanciamento() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da renda mensal: R$ ");
        double renda = scanner.nextDouble();
        System.out.print("Digite o valor da prestação desejada: R$ ");
        double prestacao = scanner.nextDouble();

        boolean aprovado = true;
        String motivoNegacao = "";

        if (prestacao > (renda * 0.30)) {
            aprovado = false;
            motivoNegacao = "Financiamento negado por alta prestação";
        } else if (prestacao > 3000.00 && renda < 10000.00) {
            aprovado = false;
            motivoNegacao = "Financiamento negado por baixa renda";
        }

        if (aprovado) {
            System.out.println("Financiamento aprovado");
        } else {
            System.out.println(motivoNegacao);
        }

        scanner.close();
    }
}