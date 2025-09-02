

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = criarConta(scanner);

        System.out.println("\n=======================================");
        System.out.println(conta.getMensagemBoasVindas());
        System.out.println("=======================================");

        scanner.close();
    }

    private static Conta criarConta(Scanner scanner) {
        System.out.print("Por favor, insira o número da Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, insira o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, insira o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, insira o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        return new Conta(numero, agencia, nomeCliente, saldo);
    }
}

