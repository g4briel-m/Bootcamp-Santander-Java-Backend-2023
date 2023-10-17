
public class MainMethod {

	public static void main(String[] args) {
		ListaTarefas lista = new ListaTarefas();
		
		lista.adicionarTarefa("Tarefa1");
		lista.adicionarTarefa("Tarefa1");
		lista.adicionarTarefa("Tarefa3");
		lista.removerTarefa("Tarefa1");
		System.out.println(lista.obterDescTarefas() + lista.obterNumeroTotalTarefas());
	}

}
