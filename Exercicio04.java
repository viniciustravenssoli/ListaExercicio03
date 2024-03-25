import java.util.Scanner;

import ClassesHelper.Converter;

public class Exercicio04 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        var converter = new Converter();
        
        System.out.println("Informe o valor da cotacao do dolar: ");
        converter.Cotacao= leitor.nextDouble();

        System.out.println("Informe a qntd em dolares:");
        converter.QntdDolares = leitor.nextDouble();
        leitor.close();

        System.out.println("A quantidade de dolares informada é igual a: R$" + (converter.QntdDolares * converter.Cotacao));

    }
}
