package entities;

import interfaces.Imprimivel;

public class Documento implements Imprimivel {
    String type;

    public Documento(String type) {
        this.type =  type;
    }

    @Override
    public void imprimir() {
        System.out.println("O arquivo do tipo " + this.type + " esta sendo impresso.");
    }
}
