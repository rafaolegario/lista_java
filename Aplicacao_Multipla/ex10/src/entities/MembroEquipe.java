package entities;

public abstract class MembroEquipe {
  protected String nome;

  public MembroEquipe(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public abstract void trabalhar();
}
