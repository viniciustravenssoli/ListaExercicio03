import java.util.Scanner;

public class Exercicio16 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);
        double salarioMinimo = 1.412; 

        System.out.println("Digite o número total de funcionários:");
        int totalFuncionarios = leitor.nextInt();

        double totalReajuste = 0;

        for (int i = 1; i <= totalFuncionarios; i++) {
            System.out.println("\nFuncionário " + i + ":");

            System.out.println("Digite o salário do funcionário:");
            double salario = leitor.nextDouble();

            double percentualReajuste;

            if (salario < 3 * salarioMinimo) {
                percentualReajuste = 0.5; // 50%
            } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
                percentualReajuste = 0.2; // 20%
            } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
                percentualReajuste = 0.15; // 15%
            } else {
                percentualReajuste = 0.1; // 10%
            }

            double reajuste = salario * percentualReajuste;
            totalReajuste += reajuste;
            double salarioNovo = salario + reajuste;

            System.out.println("Reajuste: R$" + reajuste);
            System.out.println("Salário novo: R$" + salarioNovo);
        }

        System.out.println("Total de reajuste dado aos funcionários: R$" + totalReajuste);

        leitor.close();
    }
}
