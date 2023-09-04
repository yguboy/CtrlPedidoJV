import controller.PedidoController;
import model.Cliente;
import model.Produto;
import model.Pedido;
import service.PedidoService;
import controller.PedidoController;


public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(101, "Alice");
        Cliente cliente2 = new Cliente(102, "Bob");

        PedidoController pedidoController = new PedidoController(new PedidoService());

        Pedido pedido1 = pedidoController.criarPedido(cliente1);
        Pedido pedido2 = pedidoController.criarPedido(cliente2);

        Produto produto1 = new Produto(1, "Camiseta", 19.99);
        Produto produto2 = new Produto(2, "Calça Jeans", 49.99);

        pedidoController.adicionarProdutoAoPedido(pedido1, produto1);
        pedidoController.adicionarProdutoAoPedido(pedido1, produto2);
        pedidoController.adicionarProdutoAoPedido(pedido2, produto1);

        System.out.println("Pedidos de " + cliente1.getNome() + ":");
        for (Pedido pedido : pedidoController.listarPedidosCliente(cliente1)) {
            System.out.println("Pedido ID: " + pedido.getId() + ", Total: " + pedido.calcularTotal());
        }

        System.out.println("Pedidos de " + cliente2.getNome() + ":");
        for (Pedido pedido : pedidoController.listarPedidosCliente(cliente2)) {
            System.out.println("Pedido ID: " + pedido.getId() + ", Total: " + pedido.calcularTotal());
        }
    }
}
