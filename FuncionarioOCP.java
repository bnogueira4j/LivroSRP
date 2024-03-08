public class FuncionarioOCP {
    private String nome;
    private double salarioBase;
    private String tipo; // Tipo de funcionário

    public FuncionarioOCP(String nome, double salarioBase, String tipo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tipo = tipo;
    }

    public double calcularSalario() {
        if (tipo.equals("gerente")) {
            return salarioBase * 1.2; // Gerente tem 20% de bônus
        } else if (tipo.equals("programador")) {
            return salarioBase + 200; // Programador recebe um bônus fixo de 200
        } else if (tipo.equals("atendente")) {
            return salarioBase; // Atendente recebe apenas o salário base
        } else {
            return 0; // Tipo de funcionário não reconhecido
        }
    }

    public String getNome() {
        return nome;
    }
}


public class Main {
    public static void main(String[] args) {
        FuncionarioOCP gerente = new FuncionarioOCP("Carlos", 3000, "gerente");
        FuncionarioOCP programador = new FuncionarioOCP("João", 2500, "programador");
        FuncionarioOCP atendente = new FuncionarioOCP("Maria", 2000, "atendente");

        // Calculando os salários dos funcionários
        System.out.println(gerente.getNome() + ": Salário = " + gerente.calcularSalario());
        System.out.println(programador.getNome() + ": Salário = " + programador.calcularSalario());
        System.out.println(atendente.getNome() + ": Salário = " + atendente.calcularSalario());
    }
}

