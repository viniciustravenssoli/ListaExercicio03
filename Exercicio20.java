import java.util.Scanner;

public class Exercicio20 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = leitor.nextInt();
        
        System.out.println("Digite a quantidade de horas/aula ministradas:");
        int horasAula = leitor.nextInt();
        
        double salario = calcularSalario(nivel, horasAula);
        
        System.out.println("O salário do professor é: R$" + salario);
        
        leitor.close();
    }
    
    public static double calcularSalario(int nivel, int horasAula) {
        double valorHoraAula;
        
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido. Utilizando o valor padrão de 12 por hora/aula.");
                valorHoraAula = 12.00;
                break;
        }
        
        return valorHoraAula * horasAula;
    }
}
