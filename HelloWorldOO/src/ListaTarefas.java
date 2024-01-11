public class ListaTarefas {

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

}
