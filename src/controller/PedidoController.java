package controller;

import model.Cliente;
import model.Pedido;
import model.Produto;
import service.PedidoService;

import java.util.List;

public class PedidoController {
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public Pedido criarPedido(Cliente cliente) {
        return pedidoService.criarPedido(cliente);
    }

    public void adicionarProdutoAoPedido(Pedido pedido, Produto produto) {
        pedidoService.adicionarProdutoAoPedido(pedido, produto);
    }

    public List<Pedido> listarPedidosCliente(Cliente cliente) {
        return pedidoService.listarPedidosCliente(cliente);
    }
}
