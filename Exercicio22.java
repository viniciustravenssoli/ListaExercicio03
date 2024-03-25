import java.util.Scanner;

public class Exercicio22 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (1 para residência, 2 para comércio, 3 para indústria):");
        int tipoCliente = leitor.nextInt();

        System.out.println("Digite o consumo de energia em KW/h:");
        double consumoEnergia = leitor.nextDouble();

        double valorKWh = 0;
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.602;
                break;
            case 2:
                valorKWh = 0.483;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido. Utilizando o valor padrão de residência (0.602 KW/h).");
                valorKWh = 0.602;
                break;
        }

        double valorConta = valorKWh * consumoEnergia;

        System.out.println("O valor da conta de luz é: " + valorConta);

        leitor.close();
    }

}
