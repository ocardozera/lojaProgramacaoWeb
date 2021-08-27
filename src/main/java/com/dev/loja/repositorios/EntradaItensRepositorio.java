package com.dev.loja.repositorios;

import com.dev.loja.modelos.EntradaItens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaItensRepositorio extends JpaRepository<EntradaItens, Long> {
}
