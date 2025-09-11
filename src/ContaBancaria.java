import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private Cliente cliente;
    private double saldo;
    private List<Transacao> transacoes;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

  
    public ContaBancaria(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
        this.transacoes = new ArrayList<>();
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            Transacao transacao = new Transacao("Depósito", valor);
            transacoes.add(transacao);
            transacao.registrar();
            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

   
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            Transacao transacao = new Transacao("Saque", valor);
            transacoes.add(transacao);
            transacao.registrar();
            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void exibirHistorico() {
        System.out.println("\n=== Histórico de Transações ===");
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (Transacao transacao : transacoes) {
                System.out.println(transacao.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Conta Bancária - " + cliente.toString() + " | Saldo: R$ " + String.format("%.2f", saldo);
    }
}
