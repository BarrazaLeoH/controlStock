package com.controlStock.controlStock.controller;

import com.controlStock.controlStock.model.LoginParams;
import com.controlStock.controlStock.model.Usuario;
import com.controlStock.controlStock.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioJpaRepository usuarioJpaRepository;
    @GetMapping(value = "/login")
    public String muestra_login(Model model){
        return "login";
//        return productoJpaRepository.findAll();

    }
    @GetMapping(value = "/logout")
    public String cierra_sesion(Model model, HttpSession session){
        session.invalidate();
        return "login";
//        return productoJpaRepository.findAll();

    }
    @PostMapping(value = "/login")
    public String inicia_sesion (@ModelAttribute  LoginParams loginParams, HttpSession session){
        List<Usuario> lista=usuarioJpaRepository.findAllByCorreoAndContrasena(loginParams.getEmail(),loginParams.getPassword());
                if(lista.size()==1) {
                    session.setAttribute("sesionUsuario",lista.get(0));
                    System.out.println("Logueado");
                }else{
                    System.out.println("No logueado");
                    return "login";
                }
        return "redirect:/producto/listar";
    }
}
