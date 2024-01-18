import java.time.LocalDate;

public class TestadorListaEncadeada {

    public static void main(String[] args) {
        Tarefa estudoJava = new Tarefa("Estudo de Java Básico", "Estudar as estruturas básicas da linguagem java", LocalDate.now());
        Tarefa estudoBancoDados = new Tarefa("Estudo de Banco de Dados", "Estudar as operações SQL", LocalDate.now());
        Tarefa estudoModelagemProcessos = new Tarefa("Estudo de Modelagem de Processos", "Estudar BPMN", LocalDate.now());

        ListaTarefasUsandoListaEncadeada lista = new ListaTarefasUsandoListaEncadeada();
        System.out.println("Adicionando tarefas na lista");
        lista.adicionarTarefa(estudoJava);
        lista.adicionarTarefa(estudoBancoDados);
        lista.adicionarTarefa(estudoModelagemProcessos);

        System.out.println("Atualizando o primeiro elemento da lista");
        Tarefa tempoDescanso = new Tarefa("Descansar", "Descansar", LocalDate.now());
        Tarefa tempoDescanso2 = new Tarefa("Descansar Novamente", "Descansar Novamente", LocalDate.now());

        lista.imprimirListaTarefas();
        lista.atualizarTarefa("Estudo de Java Básico", tempoDescanso);
        lista.atualizarTarefa("Estudo de Banco de Dados", tempoDescanso2);
        lista.imprimirListaTarefas();

        System.out.println("Excluindo tarefa da lista");
        lista.excluirTarefa("Estudo de Banco de Dados");



        lista.imprimirListaTarefas();

    }

}
