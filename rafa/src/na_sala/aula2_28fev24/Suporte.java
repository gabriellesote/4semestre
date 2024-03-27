package na_sala.aula1_21fev24.aula2_28fev24;

public class Suporte extends Funcionario {

    public Suporte(String nome,int id, double salario, Cargo cargo){
        super(nome,id,salario,cargo);
    }

    public double calcularSalario(double salario){
        return salario * 1.05;
    }
}
