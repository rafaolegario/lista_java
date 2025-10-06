import entities.Computador;
import entities.Memoria;
import entities.Processador;

public class App {
    public static void main(String[] args) throws Exception {
        Processador processador1 = new Processador("Intel Core i7-12700K");
        Memoria memoria1 = new Memoria(16);

        Computador pc1 = new Computador(processador1, memoria1);
        pc1.exibirInformacoes();

        System.out.println();

        Processador processador2 = new Processador("AMD Ryzen 9 5900X");
        Memoria memoria2 = new Memoria(32);

        Computador pc2 = new Computador(processador2, memoria2);
        pc2.exibirInformacoes();
    }
}
