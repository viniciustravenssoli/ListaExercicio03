import java.util.Scanner;

import ClassesHelper.Aluno;
import ClassesHelper.Automovel;

public class Exercicio02 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        var automovel = new Automovel();
        int consumo;

        System.out.println("Informe a distancia percorrida pelo automovel: ");
        automovel.Distancia = leitor.nextInt();

        System.out.println("Informe o combustivel consumido pelo automovel: ");
        automovel.Combustivel = leitor.nextInt();
        leitor.close();

        consumo = automovel.Distancia / automovel.Combustivel;

        System.out.println("O consumo medio do automovel é de " + consumo + "km/l");

    }
}
