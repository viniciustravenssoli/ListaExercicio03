import java.util.Scanner;

public class Exercicio21 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a idade do nadador:");
        int idade = leitor.nextInt();
        
        String categoria = classificarNadador(idade);
        
        System.out.println("O nadador está na categoria: " + categoria);
        
        leitor.close();
    }
    
    public static String classificarNadador(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            return "Sênior";
        } else {
            return "Idade fora da faixa etária";
        }
    }
}
