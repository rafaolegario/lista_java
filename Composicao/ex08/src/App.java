import entities.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Fusca", 80);
        Carro carro2 = new Carro("Ferrari", 650);

        carro1.exibirInfo();
        System.out.println("-----------------------");
        carro2.exibirInfo();
    }
}
