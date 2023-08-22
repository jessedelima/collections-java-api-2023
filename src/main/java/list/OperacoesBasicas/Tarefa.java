package main.java.list.OperacoesBasicas;

public class Tarefa {

    private String descricao;
    //atributo


    public Tarefa(String descricao) {
        this.descricao =  descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa;
    }
}
