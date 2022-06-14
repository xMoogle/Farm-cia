package com.farmaciagen.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmaciagen.farmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>
{
 public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
