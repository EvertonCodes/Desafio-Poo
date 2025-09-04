import java.util.Scanner;

class Cliente {
    String nome;
    int idade;

    Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class ContaBancaria {
    Cliente cliente;
    double saldo;

    ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

public class CabralCorporationBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao Cabral Corporation Bank ===");
        System.out.println("--- Cadastro de Cliente ---");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        Cliente cliente = new Cliente(nome, idade);
        ContaBancaria conta = new ContaBancaria(cliente);

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir Saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor para depósito: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                }
                case 2 -> {
                    System.out.print("Digite o valor para saque: ");
                    double valor = sc.nextDouble();
                    conta.sacar(valor);
                }
                case 3 -> conta.exibirSaldo();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
