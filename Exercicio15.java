import java.util.Scanner;

public class Exercicio15 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        double totalDesconto = 0;
        double totalPago = 0;
        
        while (true) {
            System.out.println("Informe o tipo de combustível do veículo (alcool, gasolina, diesel) ou digite '0' para encerrar:");
            String combustivel = leitor.nextLine().toLowerCase();
            
            if (combustivel.equals("0")) {
                break;
            }
            
            System.out.println("Informe o valor do veículo:");
            double valorVeiculo = leitor.nextDouble();
            leitor.nextLine(); 
            
            double desconto;
            switch (combustivel) {
                case "alcool":
                    desconto = valorVeiculo * 0.25;
                    break;
                case "gasolina":
                    desconto = valorVeiculo * 0.21;
                    break;
                case "diesel":
                    desconto = valorVeiculo * 0.14;
                    break;
                default:
                    desconto = 0;
                    System.out.println("Tipo de combustível inválido. Desconto será 0%.");
                    break;
            }
            
            double valorPago = valorVeiculo - desconto;
            
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente:" + valorPago);
            
            totalDesconto += desconto;
            totalPago += valorPago;
        }
        
        System.out.println("Total de desconto concedido:" + totalDesconto);
        System.out.println("Total pago pelos clientes:" + totalPago);
        
        leitor.close();
    }
}   
