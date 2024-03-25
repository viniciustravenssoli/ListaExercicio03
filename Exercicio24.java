import java.util.Scanner;

public class Exercicio24 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = leitor.nextDouble();
        
        System.out.println("Digite a nota da avaliação semestral:");
        double notaSemestral = leitor.nextDouble();
        
        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = leitor.nextDouble();
        
        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);
        
        System.out.println("A nota final do estudante é: " + notaFinal);
        
        leitor.close();
    }
    
    public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }

}
