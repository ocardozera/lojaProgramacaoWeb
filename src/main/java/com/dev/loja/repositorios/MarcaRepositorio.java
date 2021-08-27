package com.dev.loja.repositorios;

import com.dev.loja.modelos.Estado;
import com.dev.loja.modelos.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepositorio extends JpaRepository<Marca, Long> {
}
