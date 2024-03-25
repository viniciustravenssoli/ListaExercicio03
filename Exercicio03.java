import java.util.Scanner;

import ClassesHelper.Vendedor;

public class Exercicio03 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();

        System.out.println("Informe o nome do vendedor: ");
        vendedor.Nome = leitor.nextLine();

        System.out.println("Informe o salario do vendedor: ");
        vendedor.Salario = leitor.nextDouble();

        System.out.println("Informe o total do valor de vendas: ");
        vendedor.ValorVendas = leitor.nextDouble();
        leitor.close();

        var comissao = (vendedor.ValorVendas * 15) / 100;

        System.out.println(vendedor.Nome);
        System.out.println(vendedor.Salario);
        System.out.println(vendedor.Salario + comissao);
    }
}
