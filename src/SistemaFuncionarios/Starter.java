package SistemaFuncionarios;

import java.util.Scanner;

public class Starter {
    private int opcao = -1;
    final private Scanner teclado = new Scanner(System.in);

    public void initializer(){
        System.out.printf("%n");
        System.out.printf("-----------------------------%n");
        System.out.printf("| ******* Gestão  Rh *******|%n");
        System.out.printf("| 1 - Cadastrar funcionários|%n");
        System.out.printf("| 2 - Calcular Remuneração  |%n");
        System.out.printf("| 3 - Listar funcionários   |%n");
        System.out.printf("| 4 - Custo total folha     |%n");
        System.out.printf("| 5 - Gerar relatório       | %n ");
        System.out.printf("-----------------------------%n");
        opcao = teclado.nextInt();
        teclado.nextLine();

    }
}
