import java.time.LocalDate;

public class Tarefa {

    private LocalDate data;
    private String titulo;
    private String descricao;
    private boolean executada = false;
    private Tarefa proximaTarefa;

    private LocalDate modificadoEm;

    public Tarefa(String novoTitulo, String novaDescricao, LocalDate novaData) {
        titulo = novoTitulo;
        descricao = novaDescricao;
        data = novaData;
        modificadoEm = LocalDate.now();
    }

    public void executarTarefa() {
        executada = true;
    }

    public void imprimirTarefa() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Executada: " + executada);
    }

    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
        modificadoEm = LocalDate.now();
    }

    public void setDescricao(String novaDescricao) {
        descricao = novaDescricao;
        modificadoEm = LocalDate.now();
    }

    public void setData(LocalDate novaData){
        data = novaData;
        modificadoEm = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public Tarefa getProximaTarefa(){
        return proximaTarefa;
    }

    public void setProximaTarefa(Tarefa novaTarefa){
        proximaTarefa = novaTarefa;
    }

    public void setTarefaAnterior(Tarefa tarefa) {
        tarefaAnterior = tarefa;
    }

    public Tarefa getTarefaAnterior() {
        return tarefaAnterior;
    }


}
