package entities;

import interfaces.Imprimivel;

public class Foto implements Imprimivel {
    String type;

    public Foto(String type) {
        this.type =  type;
    }

    @Override
    public void imprimir() {
        System.out.println("O arquivo do tipo " + this.type + " esta sendo impresso.");
    }
}
