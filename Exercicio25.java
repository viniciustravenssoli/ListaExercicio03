import java.util.Scanner;

public class Exercicio25 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do estudante:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite o número de matrícula do estudante:");
        int matricula = leitor.nextInt();
        
        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = leitor.nextDouble();
        
        System.out.println("Digite a nota da avaliação semestral:");
        double notaSemestral = leitor.nextDouble();
        
        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = leitor.nextDouble();
        
        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);
        
        String classificacao = determinarClassificacao(notaFinal);
        
        System.out.println("\nNome do estudante: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
        
        leitor.close();
    }
    
    public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }
    
    public static String determinarClassificacao(double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }
}
