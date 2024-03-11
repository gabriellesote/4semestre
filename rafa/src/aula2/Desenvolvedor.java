package aula2;

public class Desenvolvedor  extends Funcionario{

    public Desenvolvedor(String nome, int id, double salario){
        super(nome,id,salario);
    }
    public double calcularSalario(double salario){
        return salario * 0.1;
    }
}
