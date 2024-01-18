import java.time.LocalDate;

public class TestadorListaSimples {

    public static void main(String[] args) {
        Tarefa estudoJava = new Tarefa("Estudo de Java Básico", "Estudar as estruturas básicas da linguagem java", LocalDate.now());
        Tarefa estudoBancoDados = new Tarefa("Estudo de Banco de Dados", "Estudar as operações SQL", LocalDate.now());
        Tarefa estudoModelagemProcessos = new Tarefa("Estudo de Modelagem de Processos", "Estudar BPMN", LocalDate.now());

        estudoJava.imprimirTarefa();
        estudoJava.executarTarefa();
        estudoJava.imprimirTarefa();


        System.out.println("Trabalhando com lista de tarefas");

        ListaTarefasUsandoListaSimples lista = new ListaTarefasUsandoListaSimples();

        System.out.println("Imprimindo a lista (vazia)");
        lista.imprimirListaTarefas();

        System.out.println("Adicionando uma tarefa");
        lista.adicionarTarefa(estudoJava);
        lista.adicionarTarefa(estudoBancoDados);

        System.out.println("Imprimindo a lista (um elemento)");
        lista.imprimirListaTarefas();

        System.out.println("Excluindo uma tarefa");
        lista.excluirTarefa("Estudo de Java Básico");

        System.out.println("Atualizando uma tarefa");
        lista.atualizarTarefa("Estudo de Banco de Dados", estudoModelagemProcessos);

        System.out.println("Imprimindo a lista (vazia)");
        lista.imprimirListaTarefas();
    }

}
