package projeto_lpo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private ArrayList<Livro> livros; // Lista de livros da biblioteca
    private ArrayList<Livro> emprestados; // Lista de livros emprestados

    // Construtor que inicializa as listas de livros
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestados = new ArrayList<>();
    }

    // Método para adicionar um livro à lista de livros
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    // Método para emprestar um livro
    public void emprestarLivro(Livro livro) {
        if (livros.contains(livro) && !emprestados.contains(livro)) {
            emprestados.add(livro);
        }
    }

    // Método para devolver um livro
    public void devolverLivro(Livro livro) {
        emprestados.remove(livro);
    }

    // Método para imprimir todos os livros em ordem alfabética pelo título
    public void imprimirLivros() {
        Collections.sort(livros, (l1, l2) -> l1.titulo.compareTo(l2.titulo));
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    // Método getter para a lista de livros emprestados
    public List<Livro> getEmprestados() {
        return new ArrayList<>(emprestados); // Retorna uma cópia da lista de emprestados
    }
}
