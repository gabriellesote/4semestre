package aula6;

import java.util.Arrays;
public class App2 {
    public static void main(String[] args) throws Exception {

        int quantidade = 1000000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }


        int resultado = linearSearch(vetor, 13);
        System.out.println(resultado);

        long tempoInicial = System.currentTimeMillis();
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Busca Linear executada em = " + (tempoFinal - tempoInicial) + "ms");

        Arrays.sort(vetor);

        tempoInicial = System.currentTimeMillis();
        resultado = binaryTreeSearch(vetor,0);
        System.out.println(resultado);
        tempoFinal = System.currentTimeMillis();

        System.out.println("Busca 'árvore binária' executada em = " + (tempoFinal - tempoInicial) + " ms");



    }
    public static int linearSearch ( int arr[], int x){
        int n = arr.length;

        //Percorrer o array
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                // Retorna o índice caso tenha achado!
                return i;
            }
        }
        // Retorna -1 quando NÃO ACHOU!
        return -1;
    }

    // Função para busca na estratégia "árvore binária"
    public static int binaryTreeSearch ( int arr[], int x){
        int n = arr.length;
        int l = 0; //esquerdo
        int r = n - 1;

        // Enquanto for possível "estreitar a árvore"
        while (l <= r) {
            int mid = (l + r) / 2;

            // Se o número procurado estiver BEM no meio, ele retornará o índice (mid)
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) { // número buscado é menor
                r = mid - 1;

            } else { // número buscado é maior!
                l = mid + 1;
            }
        }

        return -1;
    }

}


