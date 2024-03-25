import java.util.Scanner;

import ClassesHelper.Pessoa;

public class Exercicio13 {
    public static void Executar()
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantas pessoas deseja cadastrar?");
        int n = leitor.nextInt();
        leitor.nextLine(); 
        
        int aptos = 0;
        int naoAptos = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o nome da pessoa " + i + ":");
            String nome = leitor.nextLine();
            
            System.out.println("Informe o sexo da pessoa " + i + " (M para masculino, F para feminino):");
            char sexo = leitor.nextLine().toUpperCase().charAt(0);
            
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = leitor.nextInt();
            leitor.nextLine();
            
            System.out.println("Informe o estado de saúde da pessoa " + i + " (B para bom, R para regular, F para frágil):");
            char saude = leitor.nextLine().toUpperCase().charAt(0);
            
            Pessoa pessoa = new Pessoa(nome, sexo, idade, saude);
            
            if (pessoa.estaApto()) {
                System.out.println(pessoa.nome + " está apto para cumprir o serviço militar obrigatório.");
                aptos++;
            } else {
                System.out.println(pessoa.nome + " não está apto para cumprir o serviço militar obrigatório.");
                naoAptos++;
            }
        }
        
        System.out.println("Total de pessoas aptas: " + aptos);
        System.out.println("Total de pessoas não aptas: " + naoAptos);
        
        leitor.close();
    }
}
