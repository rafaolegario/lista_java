package enums;
public enum Moeda {
    REAL(1.0),    
    DOLAR(5.30), 
    EURO(5.80);  

    private final double taxaDeCambio;  

    Moeda(double taxaDeCambio) {
        this.taxaDeCambio = taxaDeCambio;
    }

    public double getTaxaDeCambio() {
        return taxaDeCambio;
    }

    public double converterParaReais(double valor) {
        return valor * taxaDeCambio;
    }
}
