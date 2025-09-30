package enums;

public enum DiaSemana {
    Domingo("Domingo", "Fim de semana!"),
    Segunda("Segunda-feira", "Comeco da semana"),
    Terca("Terca-feira", "Segundo dia de trabalho"),
    Quarta("Quarta-feira", "Dia de meio de semana"),
    Quinta("Quinta-feira", "Quase la!"),
    Sexta("Sexta-feira", "Sextou!"),
    Sabado("Sabado", "Fim de semana!");

    private final String nome;
    private final String mensagem;

    DiaSemana(String nome, String mensagem) {
        this.nome = nome;
        this.mensagem = mensagem;
    }

    public void imprimirMensagem() {
        System.out.println(nome + ": " + mensagem);
    }

}
