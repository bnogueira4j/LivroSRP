import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private List<String> transacoes;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.transacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        saldo += valor;
        transacoes.add("Depósito: +" + valor);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            transacoes.add("Saque: -" + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void gerarExtrato() {
        System.out.println("Extrato da Conta: " + numeroConta);
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
        System.out.println("Saldo Atual: " + saldo);
    }
}