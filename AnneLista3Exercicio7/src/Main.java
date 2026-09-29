import java.util.Scanner;

class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota, soma = 0;
        int quantidade = 0;

        System.out.print("Digite uma nota (ou -1 para encerrar): ");
        nota = scanner.nextDouble();

        while (nota >= 0) {
            soma += nota;
            quantidade++;
            System.out.print("Digite a próxima nota (ou -1 para encerrar): ");
            nota = scanner.nextDouble();
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("\nQuantidade de notas válidas: " + quantidade);
            System.out.printf("Média aritmética: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota válida foi informada.");
        }
        scanner.close();
    }
}