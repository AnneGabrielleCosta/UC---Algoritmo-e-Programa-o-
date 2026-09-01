import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = scanner.nextInt();

        int meses = anos * 12;

        System.out.println("Sua idade equivalente em meses é: " + meses);

        scanner.close();
    }
}