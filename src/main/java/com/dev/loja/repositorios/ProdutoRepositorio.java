package com.dev.loja.repositorios;

import com.dev.loja.modelos.Estado;
import com.dev.loja.modelos.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
}
