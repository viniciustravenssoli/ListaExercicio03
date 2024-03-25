package ClassesHelper;

public class Pessoa {
    public String nome;
    public char sexo;
    public int idade;
    public char saude;

    public Pessoa(String nome, char sexo, int idade, char saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaApto() {
        return (idade >= 18 && idade <= 25) && (sexo == 'M' || sexo == 'm') && saude == 'B';
    }

}
