import java.util.Scanner;


public class CabralCorporationBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao Cabral Corporation Bank ===");
        
        // Criar o banco
        Banco banco = new Banco("Cabral Corporation Bank");
        
        System.out.println("--- Cadastro de Cliente ---");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        Cliente cliente = new Cliente(nome, idade);
        ContaBancaria conta = new ContaBancaria(cliente);
        
        // Adicionar conta ao banco
        banco.adicionarConta(conta);

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir Saldo");
            System.out.println("4 - Exibir Histórico de Transações");
            System.out.println("5 - Listar Contas do Banco");
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
                case 4 -> conta.exibirHistorico();
                case 5 -> banco.listarContas();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
