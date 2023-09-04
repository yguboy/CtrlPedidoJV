package service;

import model.Cliente;
import model.Pedido;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos;
    private int proximoId;

    public PedidoService() {
        this.pedidos = new ArrayList<>();
        this.proximoId = 1;
    }

    public Pedido criarPedido(Cliente cliente) {
        Pedido pedido = new Pedido(proximoId++, cliente);
        pedidos.add(pedido);
        return pedido;
    }

    public void adicionarProdutoAoPedido(Pedido pedido, Produto produto) {
        pedido.adicionarProduto(produto);
    }

    public List<Pedido> listarPedidosCliente(Cliente cliente) {
        List<Pedido> pedidosCliente = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().equals(cliente)) {
                pedidosCliente.add(pedido);
            }
        }
        return pedidosCliente;
    }
}
