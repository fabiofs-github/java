public class ListaTarefasUsandoListaEncadeada {

    private Tarefa primeiraTarefa;
    private Tarefa ultimaTarefa;

    public void imprimirListaTarefas(){
        Tarefa tarefaAtual = primeiraTarefa;
        while (tarefaAtual != null) {
            tarefaAtual.imprimirTarefa();
            tarefaAtual = tarefaAtual.getProximaTarefa();
        }
    }

    public void adicionarTarefa(Tarefa novaTarefa){
        if (primeiraTarefa == null) {
            primeiraTarefa = novaTarefa;
            ultimaTarefa = novaTarefa;
        } else {
            ultimaTarefa.setProximaTarefa(novaTarefa);
            ultimaTarefa = novaTarefa;
        }
    }

    public void excluirTarefa(String titulo){
        if (primeiraTarefa != null) {
            if (primeiraTarefa.getTitulo().equals(titulo)) {
                primeiraTarefa = primeiraTarefa.getProximaTarefa();
            } else {
                Tarefa tarefaAtual = primeiraTarefa;
                while (!tarefaAtual.getProximaTarefa().getTitulo().equals(titulo)) {
                    tarefaAtual = tarefaAtual.getProximaTarefa();
                }
                tarefaAtual.setProximaTarefa(tarefaAtual.getProximaTarefa().getProximaTarefa());
            }
        }
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


}
