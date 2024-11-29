package com.parcial.electiva.repository;

import com.parcial.electiva.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
