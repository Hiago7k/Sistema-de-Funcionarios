package SistemaFuncionarios;

public class Analista extends Funcionario {
    private String especialidade;
    //Recebe um adicional fixo pela especialidade.


    public Analista(String nome, String CPF, double salario, String especialidade) {
        super(nome, CPF, salario);
        this.especialidade = especialidade;
    }
}
