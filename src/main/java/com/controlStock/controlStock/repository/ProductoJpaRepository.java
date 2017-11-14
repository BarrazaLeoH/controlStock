package com.controlStock.controlStock.repository;

import com.controlStock.controlStock.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProductoJpaRepository extends JpaRepository<Producto,Long> {

    Producto findById(int id);
}
