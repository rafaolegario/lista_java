import entities.Designer;
import entities.Programador;
import entities.Projeto;
import entities.Tarefa;
import enums.Prioridade;

public class App {
    public static void main(String[] args) throws Exception {
        Projeto projeto = new Projeto("Sistema de Gestão de Biblioteca");

        projeto.adicionarMembro(new Programador("Rafael"));
        projeto.adicionarMembro(new Programador("Lucas"));
        projeto.adicionarMembro(new Designer("Mariana"));

        projeto.adicionarTarefa(new Tarefa("Implementar login de usuários", Prioridade.ALTA));
        projeto.adicionarTarefa(new Tarefa("Criar layout da dashboard", Prioridade.MEDIA));
        projeto.adicionarTarefa(new Tarefa("Corrigir bugs do sistema", Prioridade.URGENTE));

        projeto.exibirProjeto();
    }
}
