package SistemaFuncionarios;

import java.util.Scanner;

public class Starter {
    private int opcao = -1;
    final private Scanner teclado = new Scanner(System.in);

    public void initializer() {

        do {
            exibeMenu();
            switch (opcao) {
                case 1:
                    // cadastrar cliente
                    cadastrarFuncionarios();
                    break;
                case 2:
                    // calcular remuneração
                    break;
                case 3:
                    // listar funcionários
                    listarFuncionarios();
                    break;
                case 4:
                    // custo total da folha
                    break;
                case 5:
                    // gerar relatório
                    break;
                default:
                    System.out.printf("Opção invalida!%n");
                    break;
            }
        } while (opcao != 0);
        System.out.printf("Programa encerrado%n");
    }

    public void exibeMenu() {
        System.out.printf("%n");
        System.out.printf("-----------------------------%n");
        System.out.printf("| ******* Gestão  Rh *******|%n");
        System.out.printf("| 1 - Cadastrar funcionários|%n");
        System.out.printf("| 2 - Calcular Remuneração  |%n");
        System.out.printf("| 3 - Listar funcionários   |%n");
        System.out.printf("| 4 - Custo total folha     |%n");
        System.out.printf("| 5 - Gerar relatório       | %n");
        System.out.printf("-----------------------------%n");
        opcao = teclado.nextInt();
        teclado.nextLine();
    }

    public void cadastrarFuncionarios() {

        System.out.printf("Digite o nome do Funcionário%n");
        String nome = teclado.nextLine();

        System.out.printf("Digite o CPF do Funcionário%n");
        String CPF = teclado.nextLine();

        System.out.printf("Digite o salário do Funcionário%n");
        double salario = teclado.nextDouble();
        teclado.nextLine();

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


        System.out.printf("Informe o cargo do funcionário%n");
        System.out.printf(" 1 - Desenvolvedor%n");
        System.out.printf(" 2 - Analista%n");
        System.out.printf(" 3 - Gerente%n");
        System.out.printf("Digite o código%n");
        int cargo = teclado.nextInt();
        teclado.nextLine();

        Funcionario funcionario = new Funcionario(null, null, 0);

        if (cargo == 1) {
            // dev
            System.out.printf("Informe a linguagem principal%n");
            String linguagem = teclado.nextLine();
            funcionario = new Desenvolvedor(nome, CPF, salario, linguagem);

        } else if (cargo == 2) {
            // analista
            System.out.printf("Digite a especialidade%n");
            String especialidade = teclado.nextLine();

            funcionario = new Analista(nome, CPF, salario, especialidade);

        } else if (cargo == 3) {
            // gerente
            System.out.printf("Digite a quantidade de supervisionados%n");
            int supervisionados = teclado.nextInt();
            teclado.nextLine();

            funcionario = new Gerente(nome, CPF, salario, supervisionados);

        } else {
            System.out.printf("Cargo invalido!%n");
            return;
        }


        FuncionarioService.cadastrarFuncionario(funcionario);
    }

    public void listarFuncionarios() {
        FuncionarioService.listarFuncionarios();
    }
}
