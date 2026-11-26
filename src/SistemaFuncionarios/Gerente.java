package SistemaFuncionarios;

public class Gerente extends Funcionario{
    private int funcionariosSupervisionados;
    // bonus depende da quantidade de supervisionados

    public Gerente(String nome, String CPF, double salario, int funcionariosSupervisionados) {
        super(nome, CPF, salario);
        this.funcionariosSupervisionados = funcionariosSupervisionados;
    }

    public int getFuncionariosSupervisionados() {
        return funcionariosSupervisionados;
    }
}
