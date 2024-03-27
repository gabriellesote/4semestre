package na_sala.aula1_21fev24;
import java.util.Scanner;

// Data: 21/02/24
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" === Construa seu carro === ");


        System.out.println("Número de portas: ");
        int portas = sc.nextInt();

        sc.nextLine();

        System.out.println("Cor: ");
        String cor = sc.nextLine();

        System.out.println("Marca: ");
        String marca = sc.nextLine();


        Automovel carro = new Automovel(portas,cor,marca);

        System.out.println("Escolha a placa: ");
        String placa = sc.nextLine();
        carro.setPlaca(placa);


        System.out.println(carro);

        sc.close();
    }
}