package entities;

public class Carro {
  private String modelo;
  private Motor motor;

  public Carro(String modelo, int potenciaMotor) {
    this.modelo = modelo;
    this.motor = new Motor(potenciaMotor);
  }

  public void exibirInfo() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Potência do motor: " + motor.getPotencia() + " cavalos");
  }
}
