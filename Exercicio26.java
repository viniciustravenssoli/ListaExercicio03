import java.util.Scanner;

public class Exercicio26 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do pretendente:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a idade do pretendente:");
        int idade = leitor.nextInt();
        
        if (idade < 17 || idade > 70) {
            System.out.println("Desculpe, o pretendente não se enquadra em nenhuma das categorias ofertadas.");
        } else {
            System.out.println("Digite o grupo de risco do pretendente (baixo, medio ou alto):");
            leitor.nextLine();
            String grupoRisco = leitor.nextLine().toLowerCase();
            
            int categoria = determinarCategoria(idade, grupoRisco);
            
            System.out.println("\nNome do pretendente: " + nome);
            System.out.println("Idade do pretendente: " + idade);
            System.out.println("Grupo de risco do pretendente: " + grupoRisco);
            System.out.println("Categoria de seguro do pretendente: " + categoria);
        }
        
        leitor.close();
    }
    
    public static int determinarCategoria(int idade, String grupoRisco) {
        int categoria = 0;
        
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "baixo":
                    categoria = 1;
                    break;
                case "medio":
                    categoria = 2;
                    break;
                case "alto":
                    categoria = 3;
                    break;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "baixo":
                    categoria = 2;
                    break;
                case "medio":
                    categoria = 3;
                    break;
                case "alto":
                    categoria = 4;
                    break;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "baixo":
                    categoria = 3;
                    break;
                case "medio":
                    categoria = 4;
                    break;
                case "alto":
                    categoria = 5;
                    break;
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case "baixo":
                    categoria = 4;
                    break;
                case "medio":
                    categoria = 5;
                    break;
                case "alto":
                    categoria = 6;
                    break;
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case "baixo":
                    categoria = 7;
                    break;
                case "medio":
                    categoria = 8;
                    break;
                case "alto":
                    categoria = 9;
                    break;
            }
        }
        
        return categoria;
    }
}
