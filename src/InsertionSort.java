public class InsertionSort {
    public static ResultadoOrdenacao index(int[] vetor){
        // Início cronômetro
        long inicio = System.nanoTime();

        // Script de ordenação
        for (int i = 0; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j -1;
                vetor[j + 1] = chave;
            }
        }

        // Fim cronômetro
        long fim = System.nanoTime();

        return new ResultadoOrdenacao(inicio, fim, vetor);
    }
}
