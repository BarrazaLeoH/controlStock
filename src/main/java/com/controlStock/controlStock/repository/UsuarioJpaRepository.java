package com.controlStock.controlStock.repository;

import com.controlStock.controlStock.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long>{
    List<Usuario> findAllByCorreoAndContrasena(String correo, String password);
}
