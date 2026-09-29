import java.util.Scanner;

class nomeAlunoLista4Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] pesos = new double[6];

        System.out.println("Digite o peso de 6 caixas:");
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Caixa " + (i + 1) + " (kg): ");
            pesos[i] = scanner.nextDouble();
        }

        System.out.print("\nDigite o peso de referência para pesquisa (kg): ");
        double pesoReferencia = scanner.nextDouble();

        int contadorEncontrados = 0;
        for (double peso : pesos) {
            if (peso == pesoReferencia) {
                contadorEncontrados++;
            }
        }

        System.out.println("\n--- RESULTADO DA PESQUISA ---");
        if (contadorEncontrados > 0) {
            System.out.println("O peso " + pesoReferencia + " kg foi encontrado " + contadorEncontrados + " vez(es) nas caixas.");
        } else {
            System.out.println("Valor não localizado na amostragem.");
        }

        scanner.close();
    }
}