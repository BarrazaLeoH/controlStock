package com.controlStock.controlStock.controller;

import com.controlStock.controlStock.model.Producto;
import com.controlStock.controlStock.model.Usuario;
import com.controlStock.controlStock.repository.ProductoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/producto")
public class productoController {

    @Autowired
    private ProductoJpaRepository productoJpaRepository;

    @GetMapping(value = "/listar")
    public String listar_Productos(Model model, HttpSession session){
        if(session.getAttribute("sesionUsuario")==null){
            return "redirect:/usuario/login";
        }
        model.addAttribute("productos",productoJpaRepository.findAll());
//        Usuario usuario=(Usuario) session.getAttribute("sesionUsuario");
        return "Lista";
//        return productoJpaRepository.findAll();

    }
    @GetMapping (value = "/listar/{id}")
    public Producto listar_producto(@PathVariable final int id){
        return productoJpaRepository.findById(id);
    }


}
