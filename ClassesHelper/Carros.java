package ClassesHelper;

public class Carros {
    public static double Calcular(double preco){
        double vlrImposto = ((preco * 45) / 100);
        double vlrTaxa = ((preco+vlrImposto) * 28) / 100;
        return preco + vlrTaxa + vlrImposto;
    }
}
