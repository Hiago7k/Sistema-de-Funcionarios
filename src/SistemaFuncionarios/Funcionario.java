package SistemaFuncionarios;

public class Funcionario {
    private static int incremento;
    private int id;
    private String nome;
    private String CPF;
    private double salario;

    public Funcionario(String nome, String CPF, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.id = ++incremento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format("ID: %d - %s - CPF %s - Salário R$ %.2f%n",
                this.getId(),
                this.nome,
                this.getCPF(),
                this.salario
        );
    }
}
