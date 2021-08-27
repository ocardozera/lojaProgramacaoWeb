package com.dev.loja.repositorios;

import com.dev.loja.modelos.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {
}
