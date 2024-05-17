import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite sua agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente.concat(",").concat("obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.valueOf(saldo).concat(" já está disponível para saque.")));

    }
}