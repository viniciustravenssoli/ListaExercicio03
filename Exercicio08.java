import java.util.Scanner;

import ClassesHelper.Aluno;

public class Exercicio08 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.Name = leitor.nextLine();

        System.out.println("Informe a primeira nota do aluno: ");
        aluno.Nota1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota do aluno: ");
        aluno.Nota2 = leitor.nextDouble();

        System.out.println("Informe a terceira nota do aluno: ");
        aluno.Nota3 = leitor.nextDouble();
        leitor.close();

        var media = (aluno.Nota1 + aluno.Nota2 + aluno.Nota3) / 3;

        System.out.println("Nome do Aluno:" + aluno.Name);
        System.out.println("Primeira nota:" + aluno.Nota1);
        System.out.println("Segunda nota:" + aluno.Nota2);
        System.out.println("Terceira nota:" + aluno.Nota3);
        System.out.println("Media:" + media);

        if (media >= 7){
            System.out.println("Aprovado!");
        }
        else if (media > 5.1){
            System.out.println("Recuperação!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
}
