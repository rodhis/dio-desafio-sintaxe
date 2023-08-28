import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da sua conta");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o numero da sua agência");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome completo do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo disponível do cliente");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque");
    }

}