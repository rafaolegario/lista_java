import entities.Documento;
import entities.Foto;
import entities.Impressora;

public class App {
    public static void main(String[] args) throws Exception {
        Documento documento = new Documento("Relatorio de Vendas.pdf");
        Foto foto = new Foto("Foto de Viagem.jpg");
        Impressora impressora = new Impressora();

        impressora.imprimirArquivo(documento);
        impressora.imprimirArquivo(foto);
    }
}
