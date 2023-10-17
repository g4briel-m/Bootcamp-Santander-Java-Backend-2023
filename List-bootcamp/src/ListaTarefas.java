import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	//Atributo
	private List<Tarefa> listaTarefa;
	
	//Construtor com uma lista vazia
	public ListaTarefas() {
		this.listaTarefa = new ArrayList<>();
	}
	
	//Métodos 
	public void adicionarTarefa (String desc) {
		this.listaTarefa.add(new Tarefa(desc));
	}
	
	public void removerTarefa (String desc) {
	//Criar uma lista para remover todas as ocorrências
		List<Tarefa> removerTarefas = new ArrayList<>();
	//Foreach para percorrer
		for (Tarefa t : listaTarefa) {
			if(t.getDesc().equalsIgnoreCase(desc)) {
				removerTarefas.add(t);
			}
		}
		listaTarefa.removeAll(removerTarefas);
	}
	
	public int obterNumeroTotalTarefas() {
		return this.listaTarefa.size();
	}
	
	public String obterDescTarefas() {
		//System.out.println(listaTarefa);
		return listaTarefa.toString();
	}
}
