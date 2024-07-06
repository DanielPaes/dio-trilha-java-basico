import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        Integer conta = scanner.nextInt();

        System.out.println("Informe a agência:");
        String agencia = scanner.next();

        System.out.println("Informe o nome do cliente:");
        String nome_cliente = scanner.next();

        System.out.println("Informe o saldo:");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá " + nome_cliente + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencia + ", conta " + conta  +" e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
