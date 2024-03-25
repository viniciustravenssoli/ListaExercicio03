import java.util.Scanner;

import ClassesHelper.Carros;

public class Exercicio07 {

    public static void Executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de custo: ");
        double preco = leitor.nextDouble();
        leitor.close();

        System.out.println("Valor Venda: " + Carros.Calcular(preco));

    }
}
