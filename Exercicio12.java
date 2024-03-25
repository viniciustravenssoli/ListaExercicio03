import java.util.Scanner;

public class Exercicio12 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;
        
        char continuar;
        do {
            System.out.println("Informe o ano do veículo:");
            int ano = leitor.nextInt();
            
            double desconto;
            if (ano <= 2000) {
                desconto = 0.12; 
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }
            
            System.out.println("Informe o valor do veículo:");
            double valor = leitor.nextDouble();
            
            double valorDesconto = valor * desconto;
            double valorAPagar = valor - valorDesconto;
            
            System.out.println("Desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorAPagar);
            
            totalGeral++;
            
            System.out.println("Deseja continuar calculando desconto? (S/N)");
            continuar = leitor.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
        
        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);
        
        leitor.close();
    }
}
