package entities;

import interfaces.Pagavel;

public class Boleto implements Pagavel {
    private String codigoDeBarras;

    public Boleto(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado via Boleto. Codigo de barras: " + codigoDeBarras);
    }
}
