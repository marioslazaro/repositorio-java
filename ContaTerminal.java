import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
        System.out.println("Obrigado por ter nós como seu Banco");

        scanner.close();
    
    }
}
