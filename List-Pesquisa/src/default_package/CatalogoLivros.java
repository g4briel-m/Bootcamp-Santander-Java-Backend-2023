package default_package;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> catalago = new ArrayList<>();

	public CatalogoLivros() {
		this.catalago = new ArrayList<Livro>();
	}

	public String adicionarLivro(String titulo, String autor, int anoPublicacao) {
		catalago.add(new Livro(titulo, autor, anoPublicacao));
		return "Livro adicionado com sucesso";
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> pesquisador = new ArrayList<>();
		if (!catalago.isEmpty()) {
		for (Livro comparador : catalago) {
			if (comparador.getAutor().equalsIgnoreCase(autor)) {
				pesquisador.add(comparador);
			}
		}
		return pesquisador;
		}else {
			throw new RuntimeException("Autor nao foi encontrado!");
	}
}


	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!catalago.isEmpty()) {
			for (Livro l : catalago) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
			return livrosPorIntervaloAnos;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	  public Livro pesquisarPorTitulo(String titulo) {
		    Livro livroPorTitulo = null;
		    if (!catalago.isEmpty()) {
		      for (Livro l : catalago) {
		        if (l.getTitulo().equalsIgnoreCase(titulo)) {
		          livroPorTitulo = l;
		          break;
		        }
		      }
		      return livroPorTitulo;
		    } else {
		      throw new RuntimeException("A lista está vazia!");
		    }
		  }
	  
	  
}
