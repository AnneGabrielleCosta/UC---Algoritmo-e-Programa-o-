import java.util.Scanner;

class nomeAlunoLista4Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[5];
        String[] diasDaSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};

        double soma = 0;

        // Leitura das temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura de " + diasDaSemana[i] + " (°C): ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;
        System.out.printf("\nTemperatura média da semana: %.2f °C\n", media);

        System.out.println("Dias com temperatura estritamente acima da média:");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.println("- " + diasDaSemana[i] + " (Dia " + (i + 1) + ") com " + temperaturas[i] + " °C");
            }
        }

        scanner.close();
    }
}