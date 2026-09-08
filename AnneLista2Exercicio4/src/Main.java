import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = scanner.nextInt();

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}