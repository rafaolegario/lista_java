package entities;

public class Computador {
  private Processador processador;
  private Memoria memoria;

  public Computador(Processador processador, Memoria memoria) {
    this.processador = processador;
    this.memoria = memoria;
  }

  public void exibirInformacoes() {
    System.out.println("=== Informações do Computador ===");
    System.out.println("Processador: " + processador.getModelo());
    System.out.println("Memoria RAM: " + memoria.getCapacidade() + " GB");
  }
}
