package ClassesHelper;

public class Funcionario {
    public String nome;
    public double salario;
    public double salarioMinimo;
    public double reajuste;

    public Funcionario(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
        this.reajuste = calcularReajuste();
    }

    private double calcularReajuste() {
        if (salario < salarioMinimo * 3) {
            return salario * 0.5;
        } else if (salario >= salarioMinimo * 3 && salario <= salarioMinimo * 10) {
            return salario * 0.2;
        } else if (salario > salarioMinimo * 10 && salario <= salarioMinimo * 20) {
            return salario * 0.15;
        } else {
            return salario * 0.1;
        }
    }

    public double calcularNovoSalario() {
        return salario + reajuste;
    }

}
