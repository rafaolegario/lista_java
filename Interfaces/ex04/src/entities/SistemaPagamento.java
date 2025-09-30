package entities;

import interfaces.Pagavel;

public class SistemaPagamento {
    
    public void processarPagamento(Pagavel pagamento) {
        pagamento.pagar();
    }
}
