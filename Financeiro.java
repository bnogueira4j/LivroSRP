import java.util.List;

public class Financeiro {
    private List<Double> transacoes;

    public Financeiro(List<Double> transacoes) {
        this.transacoes = transacoes;
    }

    public void adicionarTransacao(double valor) {
        transacoes.add(valor);
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (double transacao : transacoes) {
            saldo += transacao;
        }
        return saldo;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório Financeiro:");
        System.out.println("Transações:");
        for (double transacao : transacoes) {
            System.out.println(transacao);
        }
        System.out.println("Saldo Total: " + calcularSaldo());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Double> transacoes = List.of(100.0, -50.0, 75.0, -20.0);
        Financeiro financeiro = new Financeiro(transacoes);
        financeiro.gerarRelatorio();
    }
}