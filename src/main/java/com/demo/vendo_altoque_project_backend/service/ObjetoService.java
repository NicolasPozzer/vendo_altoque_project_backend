package com.demo.vendo_altoque_project_backend.service;

import com.demo.vendo_altoque_project_backend.model.Objeto;
import com.demo.vendo_altoque_project_backend.repository.IObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetoService implements IObjetoService{
    @Autowired
    private IObjetoRepository repoObj;


    @Override
    public List<Objeto> getObjetos() {
        List<Objeto> listaObjetos = repoObj.findAll();
        return listaObjetos;
    }

    @Override
    public void saveObjeto(Objeto objeto) {
        repoObj.save(objeto);
    }

    @Override
    public void deleteObjeto(Long id_objeto) {
        repoObj.deleteById(id_objeto);
    }

    @Override
    public Objeto findObjeto(Long id_Objeto) {
        Objeto obj = repoObj.findById(id_Objeto).orElse(null);
        return obj;
    }

    @Override
    public void editObjeto(Objeto objeto) {
        this.saveObjeto(objeto);
    }
}
