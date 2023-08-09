package main.java.list.OperacoesBasicas;
import java.util.List;
import java.util.ArrayList;



public class ListaTarefa {
    //generics
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for (Tarefa t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas(){
     return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa1");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();


    }
}


