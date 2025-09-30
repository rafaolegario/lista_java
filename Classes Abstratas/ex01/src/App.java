import entities.Desenvolvedor;
import entities.Gerente;

public class App {
    public static void main(String[] args) throws Exception {
       Gerente gerente = new Gerente("Rafael",5000);
       Desenvolvedor desenvolvedor = new Desenvolvedor("João", 3500);

       System.out.println("Bonus Gerente: R$" + gerente.calcularBonus());

       System.out.println("Bonus Desenvolvedor: R$" + desenvolvedor.calcularBonus());
    }
}
