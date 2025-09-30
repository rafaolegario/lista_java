package entities;

public class Retangulo extends FormaGeometrica {
    private double base;  
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {}

    @Override
    public double calcularArea() {
        return base * altura; 
    }
}
