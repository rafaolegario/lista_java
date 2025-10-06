package entities;

public class Designer extends MembroEquipe {

  public Designer(String nome) {
    super(nome);
  }

  @Override
  public void trabalhar() {
    System.out.println(nome + " está criando o design da interface.");
  }
}
