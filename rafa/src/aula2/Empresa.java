package aula2;

import java.util.ArrayList;
import java.util.List;
public class Empresa {

    List<Funcionario> listFunc = new ArrayList<>();

    public void addFuncionario(Funcionario f){
        listFunc.add(f);
    }


    public double calcularFolhaSalarial(){
        double total = 0;

        for(Funcionario f: listFunc){
            total+= f.salario;
        }

        return total;
    }
}
