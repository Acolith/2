import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o número da sua agência: ");
        String agencia = scanner.next();
        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.print("Digite o valor que pretende depositar esse mês: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
