package com.parcial.electiva.service;
import com.parcial.electiva.entity.ItemPedido;
import com.parcial.electiva.entity.Pedido;
import com.parcial.electiva.repository.PedidoRepository;
import com.parcial.electiva.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ProductoService productoService;
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;
    public Pedido createPedido(Pedido pedido) {
        for (ItemPedido item : pedido.getItems()) {
            if (!productoService.isStockSufficient(item.getProducto().getId(), item.getCantidad())) {
                throw new RuntimeException("Stock insuficiente para el producto: " + item.getProducto().getNombre());
            }
        }
        Pedido savedPedido = pedidoRepository.save(pedido);
        for (ItemPedido item : pedido.getItems()) {
            item.setPedido(savedPedido);
            itemPedidoRepository.save(item);
        }
        return savedPedido;
    }
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
