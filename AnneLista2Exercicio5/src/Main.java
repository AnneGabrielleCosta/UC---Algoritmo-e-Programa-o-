import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Escolha a unidade de conversão:");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Kelvin");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        } else if (opcao == 2) {
            double kelvin = celsius + 273.15;
            System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}