package projeto_lpo;

public class LivroFisico extends Livro implements Comparable<LivroFisico> {
    private double preco; // Preço do livro físico

    // Construtor que inicializa os atributos
    public LivroFisico(String titulo, String isbn, double preco) {
        super(titulo, isbn); // Chama o construtor da classe pai
        this.preco = preco;
    }

    // Implementação do método getPreco que retorna o preço do livro
    @Override
    public double getPreco() {
        return preco;
    }

    // Implementação do método compareTo para comparar livros pelo título
    @Override
    public int compareTo(LivroFisico outroLivro) {
        return this.titulo.compareTo(outroLivro.titulo);
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