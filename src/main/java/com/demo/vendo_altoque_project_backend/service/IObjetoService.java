package com.demo.vendo_altoque_project_backend.service;

import com.demo.vendo_altoque_project_backend.model.Objeto;

import java.util.List;

public interface IObjetoService {


    /* Lista de Objetos */
    public List<Objeto> getObjetos();

    /* Crear */
    public void saveObjeto(Objeto objeto);

    /* Eliminar */
    public void deleteObjeto(Long id_objeto);

    /* Buscar uno */
    public Objeto findObjeto(Long id_Objeto);

    /* Editar */
    public void editObjeto(Objeto objeto);
}
