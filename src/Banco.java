import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<ContaBancaria> contas;


    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

 
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso ao " + nome);
    }


    public void listarContas() {
        System.out.println("\n=== Contas do " + nome + " ===");
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (int i = 0; i < contas.size(); i++) {
                System.out.println((i + 1) + ". " + contas.get(i).toString());
            }
        }
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public List<ContaBancaria> getContas() {
        return contas;
    }


    @Override
    public String toString() {
        return "Banco: " + nome + " (Contas: " + contas.size() + ")";
    }
}
