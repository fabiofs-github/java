public class ListaTarefasUsandoFila {

    private Tarefa primeiraTarefa;
    private Tarefa ultimaTarefa;

    public void imprimirListaTarefas(){
        Tarefa tarefaAtual = primeiraTarefa;
        while (tarefaAtual != null) {
            tarefaAtual.imprimirTarefa();
            tarefaAtual = tarefaAtual.getProximaTarefa();
        }
    }

    public void push(Tarefa novaTarefa){
        if (primeiraTarefa == null) {
            primeiraTarefa = novaTarefa;
            ultimaTarefa = novaTarefa;
        } else {
            ultimaTarefa.setProximaTarefa(novaTarefa);
            ultimaTarefa = novaTarefa;
        }
    }

    public Tarefa pick(String titulo){
        Tarefa target = null;
        if (primeiraTarefa != null) {
            if (primeiraTarefa.getTitulo().equals(titulo)) {
                primeiraTarefa = primeiraTarefa.getProximaTarefa();
            } else {
                Tarefa tarefaAtual = primeiraTarefa;
                while (!tarefaAtual.getProximaTarefa().getTitulo().equals(titulo)) {
                    tarefaAtual = tarefaAtual.getProximaTarefa();
                }
                target = tarefaAtual.getProximaTarefa();
                tarefaAtual.setProximaTarefa(tarefaAtual.getProximaTarefa().getProximaTarefa());
            }
        }
        return target;
    }

    public void atualizarTarefa(String titulo, Tarefa novaTarefa){
        if (primeiraTarefa != null) {
            if (primeiraTarefa.getTitulo().equals(titulo)) {
                novaTarefa.setProximaTarefa(primeiraTarefa.getProximaTarefa());
                primeiraTarefa.setProximaTarefa(null);
                primeiraTarefa = novaTarefa;
            } else {
                Tarefa tarefaAtual = primeiraTarefa;
                while (!tarefaAtual.getProximaTarefa().getTitulo().equals(titulo)) {
                    tarefaAtual = tarefaAtual.getProximaTarefa();
                }
                novaTarefa.setProximaTarefa(tarefaAtual.getProximaTarefa().getProximaTarefa());
                tarefaAtual.getProximaTarefa().setProximaTarefa(null);
                tarefaAtual.setProximaTarefa(novaTarefa);
            }
        }
    }

    public Tarefa pop() {
        Tarefa tarefaAtual = primeiraTarefa;
        primeiraTarefa = primeiraTarefa.getProximaTarefa();
        tarefaAtual.setProximaTarefa(null);
        return tarefaAtual;
    }


}
