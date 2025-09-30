import enums.Moeda;

public class App {
    public static void main(String[] args) throws Exception {
        double valorDolar = 100;
        double valorEuro = 50;
        double valorReal = 200;

        double valorEmReaisDolar = Moeda.DOLAR.converterParaReais(valorDolar);
        double valorEmReaisEuro = Moeda.EURO.converterParaReais(valorEuro);
        double valorEmReaisReal = Moeda.REAL.converterParaReais(valorReal);

        System.out.println(valorDolar + " Dolares equivalem a " + valorEmReaisDolar + " Reais.");
        System.out.println(valorEuro + " Euros equivalem a " + valorEmReaisEuro + " Reais.");
        System.out.println(valorReal + " Reais equivalem a " + valorEmReaisReal + " Reais.");
    }
}
