package entities;

import enums.Prioridade;

public class Tarefa {
  private String descricao;
  private Prioridade prioridade;

  public Tarefa(String descricao, Prioridade prioridade) {
    this.descricao = descricao;
    this.prioridade = prioridade;
  }

  public void exibirInformacoes() {
    System.out.println("Tarefa: " + descricao + " | Prioridade: " + prioridade);
  }
}
