import java.util.Scanner;

public class Exercicio10 {
    public static void Executar(){
        var leitor = new Scanner(System.in);
        int[] nums = new int[50];

        for (int i = 0; i < 50; i++){
            nums[i] = leitor.nextInt();
        }

        System.out.println("maior de idade: ");
        for (int valor : nums){
            if (valor > 18){
                System.out.print(valor + " - ");
            }
        }
        System.out.println("menor de idade: ");

        for (int valor : nums){
            if (valor < 18){
                System.out.print(valor + " - ");
            }
        }
    }
}
