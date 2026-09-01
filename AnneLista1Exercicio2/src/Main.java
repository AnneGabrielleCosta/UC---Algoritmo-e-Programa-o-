import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;
        double media = (double) soma / 3;

        System.out.println("A soma dos três números é: " + soma);
        System.out.println("A média aritmética entre eles é: " + media);

        scanner.close();
    }
}