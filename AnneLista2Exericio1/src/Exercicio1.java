import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else {
            System.out.println("Categoria: Adulto");
        }

        scanner.close();
    }
}