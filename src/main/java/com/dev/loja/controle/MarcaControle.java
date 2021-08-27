package com.dev.loja.controle;

import com.dev.loja.modelos.Marca;
import com.dev.loja.repositorios.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

public class MarcaControle {

    @Autowired
    private MarcaRepositorio marcaRepositorio;

    @GetMapping("/administrativo/marcas/cadastrar")
    public ModelAndView cadastrar(Marca marca) {
        ModelAndView mv = new ModelAndView("administrativo/marcas/cadastro");
        mv.addObject("marca", marca);
        return mv;
    }

    @GetMapping("/administrativo/marcas/listar")
    public  ModelAndView listar() {
        ModelAndView mv = new ModelAndView("administrativo/marcas/lista");
        mv.addObject("listaMarcas", marcaRepositorio.findAll());
        return mv;
    }

    @GetMapping("/administrativo/marcas/editar/{id}")
    public ModelAndView editar(@PathVariable("id") Long id) {
        Optional<Marca> marca = marcaRepositorio.findById(id);
        return cadastrar(marca.get());
    }

    @GetMapping("/administrativo/marcas/remover/{id}")
    public ModelAndView remover(@PathVariable("id") Long id) {
        Optional<Marca> marca = marcaRepositorio.findById(id);
        marcaRepositorio.delete(marca.get());
        return listar();
    }

    @PostMapping("/administrativo/marcas/salvar")
    public  ModelAndView salvar(@Valid Marca marca, BindingResult result) {
        if (result.hasErrors()) {
            return cadastrar(marca);
        }

        marcaRepositorio.saveAndFlush(marca);
        return cadastrar(new Marca());

    }
}
