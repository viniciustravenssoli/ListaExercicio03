import java.util.Scanner;

public class Exercicio14 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        int produtos = 40;
        
        for (int i = 1; i <= produtos; i++) {
            System.out.println("Informe o preço de custo do produto " + i + ":");
            double precoCusto = leitor.nextDouble();
            
            System.out.println("Informe o preço de venda do produto " + i + ":");
            double precoVenda = leitor.nextDouble();
            
            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
            
            if (precoVenda > precoCusto) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }
        
        double mediaPrecoCusto = somaPrecoCusto / produtos;
        double mediaPrecoVenda = somaPrecoVenda / produtos;
        
        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
        
        leitor.close();
    }
}
