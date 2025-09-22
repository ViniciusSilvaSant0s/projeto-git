import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Criação de vetor
        int[] vetor = LeitorArquivo.lerInteiros("arquivos_entrada/" + args[0]);

        // Sorts
        String[] scripts = {"BUBBLE", "INSERTION", "MERGE"};

        // Execução de scripts
        Ordenador.index(vetor, scripts);
    }
}