import java.util.Scanner;

class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "2026";
        String senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("Digite a senha de 4 dígitos: ");
            senhaDigitada = scanner.next();
            tentativas++;

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha Incorreta! Tente novamente");
            }
        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Acesso Autorizado!");
        System.out.println("Total de tentativas realizadas: " + tentativas);
        scanner.close();
    }
}