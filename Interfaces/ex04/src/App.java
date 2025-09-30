import entities.Boleto;
import entities.CartaoCredito;
import entities.SistemaPagamento;

public class App {
    public static void main(String[] args) throws Exception {
       Boleto boleto = new Boleto("123456789012");
        CartaoCredito cartao = new CartaoCredito("1234-5678-9101-1121", "Joao");

        SistemaPagamento sistema = new SistemaPagamento();

        sistema.processarPagamento(boleto);  
        sistema.processarPagamento(cartao);  
    }
}
