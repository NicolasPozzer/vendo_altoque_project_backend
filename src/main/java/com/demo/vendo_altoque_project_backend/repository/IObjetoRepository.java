package com.demo.vendo_altoque_project_backend.repository;

import com.demo.vendo_altoque_project_backend.model.Objeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IObjetoRepository extends JpaRepository<Objeto, Long> {
}
