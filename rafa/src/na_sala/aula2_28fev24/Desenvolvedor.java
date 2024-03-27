package na_sala.aula1_21fev24.aula2_28fev24;

public class Desenvolvedor  extends Funcionario{

    public Desenvolvedor(String nome, int id, double salarioBase, Cargo cargo){
        super(nome,id,salarioBase, cargo);
    }
    public double calcularSalario(double salarioBase){
        return salario * 1.1;
    }
}
