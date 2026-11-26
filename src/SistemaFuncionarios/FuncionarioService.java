package SistemaFuncionarios;

import java.util.LinkedList;

public class FuncionarioService {
    private static LinkedList<Funcionario> funcionarios = new LinkedList<>();

    public static void cadastrarFuncionario(String nome, String CPF, double salario){
        if (nome == null || nome.isEmpty()){
            System.out.printf("Nome inválido!%n");
            return;
        }

        if (CPF == null || CPF.isEmpty()){
            System.out.printf("CPF inválido!%n");
            return;
        }

        if (salario <= 0){
            System.out.printf("Salário inválido!%n");
            return;
        }

        Funcionario funcionario = new Funcionario(nome, CPF, salario);
        funcionarios.add(funcionario);
        System.out.printf("Cadastrado com sucesso: %s", funcionario.toString());

    }


    public static void  listarFuncionarios(){
        if (funcionarios.isEmpty()){
            System.out.printf("Nenhum funcionário cadastrado%n");
            return;
        }
        System.out.printf("-------------- Exibindo funcionários --------------%n");
        for (Funcionario f: funcionarios){
            System.out.printf("%s", f.toString());
        }

    }


}
