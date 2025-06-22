import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTarefas implements Comparable<ComparableTarefas>{

    String titulo;

    public ComparableTarefas(String titulo){
        this.titulo =titulo;
    }
    public int compareTo(ComparableTarefas outra){
        return this.titulo.compareTo(outra.titulo);
    }
    public String toString(){
        return this.titulo;
    }
    public static void main(String[] args) {
       List<ComparableTarefas> tarefas = new ArrayList<>();
       tarefas.add(new ComparableTarefas("Estudar"));
        tarefas.add(new ComparableTarefas("Almoçar"));
        tarefas.add(new ComparableTarefas("Dormir"));
        Collections.sort(tarefas);
        System.out.println(tarefas);
    }
}
