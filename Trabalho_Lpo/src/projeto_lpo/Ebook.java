package projeto_lpo;

public class Ebook extends Livro implements Comparable<Ebook> {
    private double preco; // Preço do ebook

    // Construtor que inicializa os atributos
    public Ebook(String titulo, String isbn, double preco) {
        super(titulo, isbn); // Chama o construtor da classe pai
        this.preco = preco;
    }

    // Implementação do método getPreco que retorna o preço do ebook
    @Override
    public double getPreco() {
        return preco;
    }

    // Implementação do método compareTo para comparar ebooks pelo título
    @Override
    public int compareTo(Ebook outroEbook) {
        return this.titulo.compareTo(outroEbook.titulo);
    }

    // Método toString que inclui os autores
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ").append(titulo)
          .append(", ISBN: ").append(isbn)
          .append(", Preço: ").append(preco)
          .append(", Autores: ");
        for (Autor autor : autores) {
            sb.append(autor).append("; ");
        }
        return sb.toString();
    }
}