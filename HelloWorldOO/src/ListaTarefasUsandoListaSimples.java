public class ListaTarefasUsandoListaSimples {

    private Tarefa[] lista = new Tarefa[10];

    public void imprimirListaTarefas(){
        for (int indice = 0; indice < lista.length; indice++){
            if (lista[indice] == null) {
                continue;
            }
            lista[indice].imprimirTarefa();
        }
    }

    public void adicionarTarefa(Tarefa novaTarefa){
        int indice = 0;
        do {
            if (lista[indice] == null) {
                lista[indice] = novaTarefa;
                 break;
            }
            indice++;
        } while(indice < lista.length);
    }

    public void excluirTarefa(String titulo){
        int indice = 0;
        do {
            if (lista[indice].getTitulo().equals(titulo)){
                lista[indice] = null;
                break;
            }
            indice++;
        } while(indice < lista.length);
    }

    public void atualizarTarefa(String titulo, Tarefa novaTarefa){
        int indice = 0;
        do {
            if (lista[indice] != null && lista[indice].getTitulo().equals(titulo)){
                lista[indice] = novaTarefa;
                break;
            }
            indice++;
        } while(indice < lista.length);
    }

}
