package enums;

public enum NivelPrioridade {
    BAIXA(1),  
    MEDIA(2),  
    ALTA(3),  
    URGENTE(4); 

    private final int nivel;  

    NivelPrioridade(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
