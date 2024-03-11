package aula2;

import java.util.Scanner;




public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static Funcionario lerDadosFuncionarios(String nome, int id, double salario){

        System.out.println("Informe o nome do funcionario");
        String nome = sc.nextLine();

        Cargo cargo = null;

        while (cargo == null){
            System.out.println("Informe o cargo do funcionario: ");
            String cargoStr = sc.nextLine();
        }

        try{
            String cargoStr;
            cargo = Cargo.valueOf(cargoStr.toUpperCase());
        }catch(IllegalArgumentException ex){
            System.out.printf("Cargo inválido. Tente Novamente!");
        }
        
        switch (cargo){
            case DESENVOLVEDOR:
                return new Desenvolvedor(nome,id,salario);
                
            case SUPORTE: 
                return new Suporte(nome,id,salario);
                
            case GERENTE: 
                return new Gerente(nome,id,salario);
                
        }
        
        return null;
    }

    public static void main(String[] args) {
        
    }
}
