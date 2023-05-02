import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraDeArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "C:\\Users\\12115423\\Desktop\\nome.txt";
        String sobrenomeArquivo = "C:\\Users\\12115423\\Desktop\\sobrenome.txt";

        List<String> nomes = lerArquivo(nomeArquivo);
        List<String> sobrenomes = lerArquivo(sobrenomeArquivo);

        for (int i = 0; i < nomes.size(); i++) {
            String nomeCompleto = nomes.get(i) + "," + sobrenomes.get(i);
            System.out.println(nomeCompleto);
        }
    }

    private static List<String> lerArquivo(String nomeArquivo) {
        List<String> linhas = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();
            while (linha != null) {
                linhas.add(linha);
                linha = leitor.readLine();
            }
            leitor.close();
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linhas;
    }
}