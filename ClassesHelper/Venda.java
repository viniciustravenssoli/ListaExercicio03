package ClassesHelper;

public class Venda {

    public double Preco;
    public double Taxa;

    public double Executar(){
        return Preco + ((Preco * Taxa) / 100);
    }
}
