import enums.DiaSemana;

public class App {
    public static void main(String[] args) throws Exception {
         for (DiaSemana dia : DiaSemana.values()) {
            dia.imprimirMensagem();
        }
    }
}
