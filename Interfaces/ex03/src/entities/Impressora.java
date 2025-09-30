package entities;

import interfaces.Imprimivel;

public class Impressora {

    public void imprimirArquivo(Imprimivel arquivo) {
        arquivo.imprimir();  
    }
}

