package SistemaFuncionarios;

import java.util.LinkedList;

public class FuncionarioService {
    private static LinkedList<Funcionario> funcionarios = new LinkedList<>();

    public static void cadastrarFuncionario(Funcionario funcionario){
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
