import java.util.ArrayList;

public class ForComFiltro {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar java");
        tarefas.add("Fazer exercicios");
        tarefas.add("Revisar codigo");

        for (String tarefa : tarefas) {
            if(tarefa.contains("java")){
                System.out.println("Tarefa de programação: " + tarefa);
            }
        }

    }
}
