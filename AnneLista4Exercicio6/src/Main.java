import java.util.ArrayList;
import java.util.Scanner;

class nomeAlunoLista4Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 42;
        int palpite;
        int tentativas = 0;

        // Lista dinâmica para armazenar os palpites errados
        ArrayList<Object> palpitesErrados = new ArrayList<>();

        System.out.println("--- BEM-VINDO AO JOGO DE ADIVINHAÇÃO ---");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("\nParabéns, você adivinhou! O número secreto é " + numeroSecreto + "!");
            } else {
                palpitesErrados.add(palpite); // Adiciona o palpite incorreto na lista

                if (palpite < numeroSecreto) {
                    System.out.println("O número secreto é MAIOR que o palpite digitado. Tente novamente.\n");
                } else {
                    System.out.println("O número secreto é MENOR que o palpite digitado. Tente novamente.\n");
                }
            }
        } while (palpite != numeroSecreto);

        System.out.println("Tentativas: " + tentativas);
        System.out.println("\nPalpites errados:");
        for (int i = 0; i < palpitesErrados.size(); i++) {
            System.out.println((i + 1) + ") " + palpitesErrados.get(i));
        }

        scanner.close();
    }
}