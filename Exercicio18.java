import java.util.Scanner;

public class Exercicio18 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a idade do funcionário:");
        int idade = leitor.nextInt();
        
        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = leitor.next().toUpperCase().charAt(0);
        
        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = leitor.nextDouble();
        
        double abono = calcularAbono(sexo, idade);
        
        double salarioLiquido = salarioFixo + abono;
        
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido com abono:" + salarioLiquido);
        
        leitor.close();
    }
    
    public static double calcularAbono(char sexo, int idade) {
        if (sexo == 'M') {
            if (idade >= 30) {
                return 100;
            } else {
                return 50;
            }
        } else {
            if (idade >= 30) {
                return 200;
            } else {
                return 80;
            }
        }
    }
}
