package aula2;

public class Suporte extends Funcionario {

    public Suporte(String nome,int id, double salario){
        super(nome,id,salario);
    }

    public double calcularSalario(double salario){
        return salario * 0.05;
    }
}
