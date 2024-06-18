package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void AdicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void oterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é :" +listatarefa.obterNumeroTotalTarefas());

        listatarefa.AdicionarTarefa("tarefa 1");

        listatarefa.AdicionarTarefa("tarefa 1");

        listatarefa.AdicionarTarefa("tarefa 2");
        System.out.println("O numero total de elementos na lista é :" +listatarefa.obterNumeroTotalTarefas());


        listatarefa.removerTarefa("tarefa 3");
        System.out.println("O numero total de elementos na lista é :" +listatarefa.obterNumeroTotalTarefas());

        listatarefa.oterDescricoesTarefas();
    }

}
