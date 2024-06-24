package projeto_lpo;

import java.util.ArrayList;
import java.util.List;

// Define a classe Orcamento que implementa a interface Compra
public class Orcamento implements Compra {
    // Lista para armazenar os livros do pedido
    private List<Livro> pedido;

    // Construtor da classe Orcamento que inicializa a lista de pedidos
    public Orcamento() {
        this.pedido = new ArrayList<>();
    }

    // Método para adicionar um livro ao pedido
    public void adicionarLivro(Livro livro) {
        this.pedido.add(livro);
    }

    // Implementação do método calcularPreco da interface Compra
    @Override
    public double calcularPreco() {
        double total = 0;
        // Itera sobre a lista de pedidos e soma o preço de cada livro ao total
        for (Livro livro : pedido) {
            total += livro.getPreco();
        }
        return total;
    }

    // Método para listar todos os livros do pedido e o valor total
    public void listarPedidos() {
        for (Livro livro : pedido) {
            // Imprime a representação do livro (supondo que Livro tenha um método toString adequado)
            System.out.println(livro);
        }
        // Imprime o valor total do pedido calculado pelo método calcularPreco
        System.out.println("Valor total do pedido: " + calcularPreco());
    }
}