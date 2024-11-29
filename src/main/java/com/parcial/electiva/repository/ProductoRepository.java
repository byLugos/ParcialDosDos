package com.parcial.electiva.repository;

import com.parcial.electiva.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
