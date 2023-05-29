import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite seu nome:");
        conta.setNome(scanner.nextLine());

        System.out.print("Digite o número da sua conta:");
        conta.setNumeroConta(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite seu saldo inicial:");
        conta.setSaldoInicial(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Conta bancária criada com sucesso");

        System.out.println("O que deseja fazer? Digite o número da ação:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Obter o saldo disponível");
        int acao = scanner.nextInt();
        scanner.nextLine();

        switch (acao) {
            case 1:
                System.out.println("Digite o valor para depositar:");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                System.out.println("Depósito realizado com sucesso. Seu novo saldo é: " + conta.getSaldo());
                break;
            case 2:
                System.out.println("Digite o valor para sacar: ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                break;
            case 3:
                double saldoDisponivel = conta.getSaldo();
                System.out.println("O seu saldo disponível é: " + saldoDisponivel);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}