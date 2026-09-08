import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
            System.out.println("O quadrado do valor é: " + (numero * numero));
        } else {
            System.out.println("O número é ímpar.");
            System.out.println("O cubo do valor é: " + (numero * numero * numero));
        }

        scanner.close();
    }
}