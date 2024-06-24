package projeto_lpo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar autores
        List<Autor> autores = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            autores.add(new Autor("Autor" + i, "autor" + i + "@email.com", "Instituição" + i));
        }

        // Criar livros físicos
        List<LivroFisico> livrosFisicos = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            LivroFisico livroFisico = new LivroFisico("Livro Físico " + i, "ISBNF" + i, 50.0 + i);
            livroFisico.adicionarAutor(autores.get(i - 1));
            livrosFisicos.add(livroFisico);
        }

        // Criar ebooks
        List<Ebook> ebooks = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            Ebook ebook = new Ebook("Ebook " + i, "ISBNE" + i, 30.0 + i);
            ebook.adicionarAutor(autores.get(i + 5));
            ebooks.add(ebook);
        }

        // Criar biblioteca e adicionar livros
        Biblioteca biblioteca = new Biblioteca();
        for (LivroFisico livroFisico : livrosFisicos) {
            biblioteca.adicionarLivro(livroFisico);
        }
        for (Ebook ebook : ebooks) {
            biblioteca.adicionarLivro(ebook);
        }

        // Criar pedidos de compra
        List<Orcamento> pedidos = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Orcamento pedido = new Orcamento();
            pedido.adicionarLivro(livrosFisicos.get(i - 1));
            pedido.adicionarLivro(ebooks.get(i - 1));
            pedidos.add(pedido);
        }

        // Listar todos os livros da biblioteca
        System.out.println("Livros na Biblioteca:");
        biblioteca.imprimirLivros();

        // Listar todos os livros emprestados (exemplo de operação)
        biblioteca.emprestarLivro(livrosFisicos.get(0));
        System.out.println("\nLivros Emprestados:");
        for (Livro livro : biblioteca.getEmprestados()) {
            System.out.println(livro);
        }

        // Listar pedidos de compra com o valor total
        System.out.println("\nPedidos de Compra:");
        for (Orcamento pedido : pedidos) {
            pedido.listarPedidos();
            System.out.println();
        }
    }
}