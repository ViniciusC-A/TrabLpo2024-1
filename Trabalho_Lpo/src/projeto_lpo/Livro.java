package projeto_lpo;

import java.util.ArrayList;

public abstract class Livro {
    protected String titulo; // Título do livro
    protected String isbn; // ISBN do livro
    protected ArrayList<Autor> autores; // Lista de autores do livro

    // Construtor que inicializa os atributos
    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autores = new ArrayList<>(); // Inicializa a lista de autores
    }

    // Método para adicionar um autor à lista de autores
    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }

    // Declaração do método abstrato getPreco, que será implementado nas subclasses
    public abstract double getPreco();
}