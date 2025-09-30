package entities;

import interfaces.Pagavel;

public class CartaoCredito implements Pagavel{
    private String numeroCartao;
    private String nomeTitular;

    public CartaoCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado via Cartao de Credito. Numero do cartao: " + numeroCartao + ", Nome do titular: " + nomeTitular);
    }
}
