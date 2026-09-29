import java.util.Scanner;

class MensagemPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Praticando lógica de programação!");
        }
        scanner.close();
    }
}