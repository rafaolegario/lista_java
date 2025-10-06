package entities;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
  private String nome;
  private List<MembroEquipe> membros;
  private List<Tarefa> tarefas;

  public Projeto(String nome) {
    this.nome = nome;
    this.membros = new ArrayList<>();
    this.tarefas = new ArrayList<>();
  }

  public void adicionarMembro(MembroEquipe membro) {
    membros.add(membro);
  }

  public void adicionarTarefa(Tarefa tarefa) {
    tarefas.add(tarefa);
  }

  public void exibirProjeto() {
    System.out.println("=== Projeto: " + nome + " ===\n");

    System.out.println("Equipe trabalhando:");
    for (MembroEquipe membro : membros) {
      membro.trabalhar();
    }

    System.out.println("\nTarefas do projeto:");
    for (Tarefa tarefa : tarefas) {
      tarefa.exibirInformacoes();
    }
  }
}
