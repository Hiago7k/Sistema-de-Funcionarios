package SistemaFuncionarios;

public class Desenvolvedor extends Funcionario {
   private String linguagem;
   // bonus de acordo com nivel tecnico


    public Desenvolvedor(String nome, String CPF, double salario, String linguagem, String cargo) {
        super(nome, CPF, salario, cargo);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }


}
