package entities;

public class Circulo extends FormaGeometrica {
    private double raio;  

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {}

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);  
    }
}
