package aula2;

public class Gerente extends Funcionario{
    public Gerente(String nome, int id, double salario){
        super(nome,id,salario);

    }

    public double calcularSalario(double salario){
        return salario * 0.2 + 1000;
    }
}
