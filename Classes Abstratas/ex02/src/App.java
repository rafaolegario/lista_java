import entities.Circulo;
import entities.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
         final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";  

        Circulo circulo = new Circulo(7);
        Retangulo retangulo = new Retangulo(10, 15);

        System.out.println("Area do Circulo: " + ANSI_GREEN + circulo.calcularArea() + ANSI_RESET);
        System.out.println("Area do Retangulo: " + ANSI_GREEN + retangulo.calcularArea() + ANSI_RESET);
    }
}
