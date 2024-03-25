import java.util.Scanner;

import ClassesHelper.Venda;

public class Exercicio06 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        Venda venda = new Venda();

        System.out.println("Informe o preço de custo do produto: ");
        venda.Preco = leitor.nextDouble();

        System.out.println("Informe a taxa de venda do produto: ");
        venda.Taxa = leitor.nextDouble();
        leitor.close();


        System.out.println("O valor de venda é de " + venda.Executar());

    }
}
