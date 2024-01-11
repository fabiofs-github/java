import java.time.LocalDate;

public class Testador {

    public static void main(String[] args) {
        Tarefa estudoJava = new Tarefa("Estudo de Java Báco", "Estudar as estruturas básicas da linguagem java", LocalDate.now());

        estudoJava.imprimirTarefa();
        estudoJava.executarTarefa();
        estudoJava.imprimirTarefa();


        System.out.println("Trabalhando com lista de tarefas");

        ListaTarefas lista = new ListaTarefas();
        lista.imprimirListaTarefas();
        lista.adicionarTarefa(estudoJava);
        lista.imprimirListaTarefas();

        Qualquer qualquerCoisa = new Qualquer();
    }

}
