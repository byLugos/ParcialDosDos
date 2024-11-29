package com.parcial.electiva.service;

import com.parcial.electiva.entity.Producto;
import com.parcial.electiva.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    public boolean isStockSufficient(Long productoId, int cantidadSolicitada) {
        Optional<Producto> productoOptional = productoRepository.findById(productoId);
        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            return producto.getCantidadDisponible() >= cantidadSolicitada;
        }
        return false;
    }
}
