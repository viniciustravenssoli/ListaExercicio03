import java.util.Scanner;

public class Exercicio09 {
    public static void Executar()
    {
        var leitor = new Scanner(System.in);
        int[] nums = new int[80];

        for (int i = 0; i < 80; i++){
            nums[i] = leitor.nextInt();
        }

        System.out.println("Valores entre 10 e 150: ");

        for (int valor : nums){
            if (valor >= 10 && valor <= 150){
                System.out.print(valor);
            }
        }
    }
}
