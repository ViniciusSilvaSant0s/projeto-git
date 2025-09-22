import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitorArquivo {

    public static int[] lerInteiros(String caminhoArquivo) throws FileNotFoundException {
        File arquivo = new File(caminhoArquivo);

        Scanner scannerContagem = new Scanner(arquivo);
        int qtdLinhas = contarLinhas(scannerContagem);
        scannerContagem.close();

        Scanner scannerLeitura = new Scanner(arquivo);
        int[] vetorInteiros = new int[qtdLinhas];
        for (int i = 0; i < qtdLinhas; i++) {
            vetorInteiros[i] = scannerLeitura.nextInt();
        }
        scannerLeitura.close();

        return vetorInteiros;
    }

    public static int contarLinhas(Scanner scanner) {
        int contadorLinhas = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            contadorLinhas++;
        }
        return contadorLinhas;
    }
}
