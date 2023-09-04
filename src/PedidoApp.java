import java.util.ArrayList;
import java.util.List;

class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto [ID: " + id + ", Nome: " + nome + ", Preço: " + preco + "]";
    }
}

class Cliente {
    private int id;
    private String nome;
    private List<Produto> carrinho;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.carrinho = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {
        carrinho.add(produto);
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    @Override
    public String toString() {
        return "\nCliente [ID: " + id + ", Nome: " + nome + "]";
    }
}

public class PedidoApp {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Camiseta", 19.99);
        Produto produto2 = new Produto(2, "Calça Jeans", 49.99);

        Cliente cliente1 = new Cliente(101, "Alice");
        Cliente cliente2 = new Cliente(102, "Bob");

        cliente1.adicionarProdutoAoCarrinho(produto1);
        cliente1.adicionarProdutoAoCarrinho(produto2);

        cliente2.adicionarProdutoAoCarrinho(produto1);

        System.out.println(cliente1);
        for (Produto produto : cliente1.getCarrinho()) {
            System.out.println("  - " + produto);
        }

        System.out.println(cliente2);
        for (Produto produto : cliente2.getCarrinho()) {
            System.out.println("  - " + produto);
        }
    }
}
