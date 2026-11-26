package SistemaFuncionarios;

import java.util.Scanner;

public class Starter {
    private int opcao = -1;
    final private Scanner teclado = new Scanner(System.in);

    public void initializer() {

        do {
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

            switch (opcao) {
                case 1:
                    // cadastrar cliente
                    System.out.printf("Digite o nome do Funcionário%n");
                    String nome = teclado.nextLine();

                    System.out.printf("Digite o CPF do Funcionário%n");
                    String CPF = teclado.nextLine();

                    System.out.printf("Digite o salário do Funcionário%n");
                    double salario = teclado.nextDouble();
                    teclado.nextLine();

                    FuncionarioService.cadastrarFuncionario(nome, CPF, salario);

                    break;
                case 2:
                    // calcular remuneração
                    break;
                case 3:
                    // listar funcionários
                    FuncionarioService.listarFuncionarios();

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
}
