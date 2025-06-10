import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o numero da agencia: ");
        numero = sc.nextInt();

        System.out.print("Por favor, digite o nome da agencia: ");
        sc.nextLine();
        agencia = sc.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        sc.nextLine();
        nomeCliente = sc.next();

        System.out.print("Por favor, digite o saldo do cliente: ");
        saldo = sc.nextDouble();

        System.out.println
                ("Ola "+ nomeCliente
                        + ", obrigado por criar uma conta em nosso banco, sua agencia eh "
                +agencia + ", conta "+numero + " seu saldo " + saldo + " ja esta disponivel para saque.");
    }
}
