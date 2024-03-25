import java.util.Scanner;

import ClassesHelper.Aluno;

public class Exercicio01 {
    public static void Executar() {
        Scanner leitor = new Scanner(System.in);
        var aluno = new Aluno();


        System.out.println("Informe o nome: ");
        aluno.Name = leitor.nextLine();

        System.out.println("Informe a primeira nota: ");
        aluno.Nota1 = leitor.nextDouble();
        System.out.println("Informe a segunda nota: ");
        aluno.Nota2 = leitor.nextDouble();
        System.out.println("Informe a terceira nota: ");
        aluno.Nota3 = leitor.nextDouble();

        double media = (aluno.Nota1 + aluno.Nota2 + aluno.Nota3) / 3;

        System.out.println("A media aritmetica é : " + media);


        leitor.close();
    }
}
