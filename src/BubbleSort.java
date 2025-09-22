public class BubbleSort {
    public static ResultadoOrdenacao index(int[] vetor){
        // Início cronômetro
        long inicio = System.nanoTime();

        // Script de ordenação (Bubble Sort)
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Fim cronômetro
        long fim = System.nanoTime();

        return new ResultadoOrdenacao(inicio, fim, vetor);
    }
}
