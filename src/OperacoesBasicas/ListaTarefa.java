import main.java.list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removeTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas () {
        return tarefaList.size();
    }
    public void obterDecricoesTarefa() {
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotalTarefas());

        listTarefa.adicionarTarefa(descricao: "tarefa 1");
        listTarefa.adicionarTarefa(descricao: "tarefa 1");
        listTarefa.adicionarTarefa(descricao: "tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotalTarefas());

        listTarefa.removeTarefa(decricao: "Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotalTarefas());

        listTarefa.obterDecricoesTarefa();
    }

}

