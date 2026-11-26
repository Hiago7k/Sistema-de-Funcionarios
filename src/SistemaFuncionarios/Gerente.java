package SistemaFuncionarios;

public class Gerente extends Funcionario{
    private int funcionariosSupervisionados;
    // bonus depende da quantidade de supervisionados

    public Gerente(String nome, String CPF, double salario, int funcionariosSupervisionados, String cargo) {
        super(nome, CPF, salario, cargo);
        this.funcionariosSupervisionados = funcionariosSupervisionados;
    }

    public int getFuncionariosSupervisionados() {
        return funcionariosSupervisionados;
    }
}
